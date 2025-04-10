import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

class Value {

    public String name;
    public String type;

    public int size;

    public Value(String name, String type) {
        this.name = name;
        this.type = type;
        this.size = 0;
    }

    public Value(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = 0;
    }

}

class Array extends Value {

    public List<Value> values = new LinkedList<>();

    public Array(String name, String type, int length) {
        super(name, type, length);
    }

}

public class Actions extends MyLangBaseListener {

    Map<String, Value> variables = new HashMap<>();
    Stack<Value> stack = new Stack<>();
    Stack<Array> arrayStack = new Stack<>();

    @Override
    public void exitProg(MyLangParser.ProgContext ctx) {
        try {
            final var outputPath = Path.of("output.ll");
            final var llvmCode = Generator.generate();
            Files.writeString(outputPath, llvmCode);
        } catch (IOException ioException) {
            throw new IllegalStateException(ioException);
        }
    }

    @Override
    public void exitAssign(MyLangParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        if (!variables.containsKey(ID)) {
            variables.put(ID, v);
            if (v instanceof Array) {
                return;
            }
            switch (v.type) {
                case "INT" -> {
                    Generator.declare_i32(ID);
                    Generator.assign_i32(ID, v.name);
                }
                case "DOUBLE" -> {
                    Generator.declare_double(ID);
                    Generator.assign_double(ID, v.name);
                }
                case "STRING" -> {
                    Generator.declare_string(ID);
                    Generator.assign_string(ID, v.name);
                }
            }
        }
    }

    @Override
    public void exitPrint(MyLangParser.PrintContext ctx) {
        String ID = ctx.ID().getText();
        String type = variables.get(ID).type;
        if (variables.containsKey(ID)) {
            if (type != null) {
                switch (type) {
                    case "INT" -> Generator.printf_i32(ID);
                    case "DOUBLE" -> Generator.printf_double(ID);
                    case "STRING" -> Generator.printf_string(ID);
                }
            } else {
                error(ctx.getStart().getLine(), "The variable of the given ID: " + ID + "does not exist");
            }
        }
    }

    @Override
    public void exitAdd(MyLangParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
            if (v1.type.equals("INT")) {
                Generator.add_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
            } else if (v1.type.equals("DOUBLE")) {
                Generator.add_double(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
            }
        } else {
            error(ctx.getStart().getLine(), "There is a mismatch in add operation");
        }
    }

    @Override
    public void exitSub(MyLangParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
            if (v1.type.equals("INT")) {
                Generator.sub_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
            } else if (v1.type.equals("DOUBLE")) {
                Generator.sub_double(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
            }
        } else {
            error(ctx.getStart().getLine(), "There is a mismatch in subtract operation");
        }
    }

    @Override
    public void exitMultiply(MyLangParser.MultiplyContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
            if (v1.type.equals("INT")) {
                Generator.mult_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
            }
            if (v1.type.equals("DOUBLE")) {
                Generator.mult_double(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
            }
        } else {
            error(ctx.getStart().getLine(), "There is a mismatch in multiply operation");
        }
    }

    @Override
    public void exitDivide(MyLangParser.DivideContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();

        if (v1.type.equals(v2.type)) {
            if (v1.type.equals("INT")) {
                Generator.div_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
            }
            if (v1.type.equals("DOUBLE")) {
                Generator.div_double(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
            }
        } else {
            error(ctx.getStart().getLine(), "There is a mismatch in divide operation");
        }
    }

    @Override
    public void exitId(MyLangParser.IdContext context) {
        final var ID = context.ID().getText();

        if (!variables.containsKey(ID)) {
            error(context.getStart().getLine(), "Variable with ID: " + ID + "does not exist");
        }

        final var value = variables.get(ID);
        switch (value.type) {
            case "INT" -> {
                Generator.load_i32(ID);
                stack.push(new Value("%" + (Generator.reg - 1), "INT", value.size));
            }
            case "DOUBLE" -> {
                Generator.load_double(ID);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE", value.size));
            }
            case "STRING" -> {
                Generator.load_string(ID);
                stack.push(new Value("%" + (Generator.reg - 1), "STRING", value.size));
            }
        }
    }

    @Override
    public void exitInt(MyLangParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), "INT"));
    }

    @Override
    public void exitDouble(MyLangParser.DoubleContext ctx) {
        stack.push(new Value(ctx.DOUBLE().getText(), "DOUBLE"));
    }

    @Override
    public void exitString(MyLangParser.StringContext ctx) {
        final var tmp = ctx.STRING().getText();
        final var content = tmp.substring(1, tmp.length() - 1);
        Generator.constant_string(content);
        final var id = "str" + (Generator.str - 1);
        stack.push(new Value(id, "STRING", content.length()));
    }

    @Override
    public void exitToint(MyLangParser.TointContext ctx) {
        Value v = stack.pop();
        Generator.fptosi(v.name);
        stack.push(new Value("%" + (Generator.reg - 1), "INT"));
    }

    @Override
    public void exitTodouble(MyLangParser.TodoubleContext ctx) {
        Value v = stack.pop();
        Generator.sitofp(v.name);
        stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
    }

    @Override
    public void exitRead(MyLangParser.ReadContext context) {
        String ID = context.ID().getText();
        Value value = new Value(ID, "STRING", 127);
        variables.put(ID, value);
        Generator.scanf(ID, 127);
    }

    // LOGICAL OPERATORS
    @Override
    public void exitAnd(MyLangParser.AndContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();

        // Short-circuit: Jeśli v1 to 0 (false), wynik to 0 (false)
        if (v1.type.equals("INT") && v2.type.equals("INT")) {
            if (Integer.parseInt(v1.name) == 0) {
                // Jeśli v1 jest false (0), wynik będzie 0, nie sprawdzamy v2
                stack.push(new Value("0", "INT"));
            } else {
                // Inaczej wykonaj operację AND
                Generator.and_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
            }
        } else {
            error(ctx.getStart().getLine(), "Operands of '&&' must be of type INT.");
        }
    }

    @Override
    public void exitOr(MyLangParser.OrContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();

        // Short-circuit: Jeśli v1 to 1 (true), wynik to 1 (true)
        if (v1.type.equals("INT") && v2.type.equals("INT")) {
            if (Integer.parseInt(v1.name) != 0) {
                // Jeśli v1 jest true (1), wynik będzie 1, nie sprawdzamy v2
                stack.push(new Value("1", "INT"));
            } else {
                // Inaczej wykonaj operację OR
                Generator.or_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
            }
        } else {
            error(ctx.getStart().getLine(), "Operands of '||' must be of type INT.");
        }
    }

    @Override
    public void exitXor(MyLangParser.XorContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals("INT") && v2.type.equals("INT")) {
            Generator.xor_i32(v1.name, v2.name);
            stack.push(new Value("%" + (Generator.reg - 1), "INT"));
        } else {
            error(ctx.getStart().getLine(), "Operands of '^' must be of type INT.");
        }
    }

    @Override
    public void exitNot(MyLangParser.NotContext ctx) {
        Value v = stack.pop();
        if (v.type.equals("INT")) {
            Generator.not_i32(v.name);
            stack.push(new Value("%" + (Generator.reg - 1), "INT"));
        } else {
            error(ctx.getStart().getLine(), "Operand of '!' must be of type INT.");
        }
    }

    void error(int line, String msg) {
        System.err.println("Error in line number: " + line + ", " + msg);
        System.exit(1);
    }
}