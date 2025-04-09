import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

class Value {
    public String name;
    public String type;
    public int size;
    public Object value;

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

    public Value(boolean boolVal) {
        this.name = boolVal ? "true" : "false";
        this.type = "BOOL";
        this.size = 0;
        this.value = boolVal;
    }

    public boolean toBoolean() {
        if (type.equals("BOOL")) {
            return (Boolean) value;
        } else if (type.equals("INT")) {
            return ((Integer) value) != 0;
        }
        throw new RuntimeException("Cannot convert to boolean: " + type);
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
    public void exitProg(MyLangParser.ProgContext context) {
        try {
            final var outputPath = Path.of("output.ll");
            final var llvmCode = Generator.generate();
            Files.writeString(outputPath, llvmCode);
        } catch (IOException ioException) {
            throw new IllegalStateException(ioException);
        }
    }

    @Override
    public void exitAssign(MyLangParser.AssignContext context) {
        System.out.println("==== exitAssign ====");
        System.out.println("Context text: " + context.getText());
        String ID = context.ID().getText();
        System.out.println("Trying to assign to variable: " + ID);
        System.out.println("Stack size before pop: " + stack.size());
        System.out.println("Context text: " + context.getText());

        Value v = stack.pop();
        System.out.println("Stack size after pop: " + stack.size());
        System.out.println("Popped value: " + v.name + " of type: " + v.type);
        System.out.println("Context text: " + context.getText());

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
                case "FLOAT" -> {
                    Generator.declare_float(ID);
                    Generator.assign_float(ID, v.name);
                }
                case "LONG" -> {
                    Generator.declare_long(ID);
                    Generator.assign_long(ID, v.name);
                }
            }
        }
    }

    @Override
    public void exitPrint(MyLangParser.PrintContext context) {
        String ID = context.ID().getText();
        String type = variables.get(ID).type;
        if (variables.containsKey(ID)) {
            if (type != null) {
                switch (type) {
                    case "INT" -> Generator.printf_i32(ID);
                    case "DOUBLE" -> Generator.printf_double(ID);
                    case "STRING" -> Generator.printf_string(ID);
                    case "FLOAT" -> Generator.printf_float(ID);
                    case "LONG" -> Generator.printf_long(ID);
                }
            } else {
                error(context.getStart().getLine(), "The variable of the given ID: " + ID + " does not exist");
            }
        }
    }

    @Override
    public void exitAdd(MyLangParser.AddContext context) {
        System.out.println("<< EXITING: add");
        System.out.println("Context text: " + context.getText());
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
            switch (v1.type) {
                case "INT" -> {
                    Generator.add_i32(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "INT"));
                }
                case "DOUBLE" -> {
                    Generator.add_double(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
                }
                case "FLOAT" -> {
                    Generator.add_float(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "FLOAT"));
                }
                case "LONG" -> {
                    Generator.add_long(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "LONG"));
                }
            }
        } else {
            error(context.getStart().getLine(), "There is a mismatch in add operation");
        }
    }

    @Override
    public void exitSub(MyLangParser.SubContext context) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
            switch (v1.type) {
                case "INT" -> {
                    Generator.sub_i32(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "INT"));
                }
                case "DOUBLE" -> {
                    Generator.sub_double(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
                }
                case "FLOAT" -> {
                    Generator.sub_float(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "FLOAT"));
                }
                case "LONG" -> {
                    Generator.sub_long(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "LONG"));
                }
            }
        } else {
            error(context.getStart().getLine(), "There is a mismatch in subtract operation");
        }
    }

    @Override
    public void exitMultiply(MyLangParser.MultiplyContext context) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
            switch (v1.type) {
                case "INT" -> {
                    Generator.mult_i32(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "INT"));
                }
                case "DOUBLE" -> {
                    Generator.mult_double(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
                }
                case "FLOAT" -> {
                    Generator.mult_float(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "FLOAT"));
                }
                case "LONG" -> {
                    Generator.mult_long(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "LONG"));
                }
            }
        } else {
            error(context.getStart().getLine(), "There is a mismatch in multiply operation");
        }
    }

    @Override
    public void exitDivide(MyLangParser.DivideContext context) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
            switch (v1.type) {
                case "INT" -> {
                    Generator.div_i32(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "INT"));
                }
                case "DOUBLE" -> {
                    Generator.div_double(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
                }
                case "FLOAT" -> {
                    Generator.div_float(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "FLOAT"));
                }
                case "LONG" -> {
                    Generator.div_long(v1.name, v2.name);
                    stack.push(new Value("%" + (Generator.reg - 1), "LONG"));
                }
            }
        } else {
            error(context.getStart().getLine(), "There is a mismatch in divide operation");
        }
    }

    @Override
    public void exitId(MyLangParser.IdContext context) {
        System.out.println("<< EXITING: Id");
        System.out.println("Context text: " + context.getText());
        final var ID = context.ID().getText();
        if (!variables.containsKey(ID)) {
            error(context.getStart().getLine(), "Variable with ID: " + ID + " does not exist");
            return;
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
            case "FLOAT" -> {
                Generator.load_float(ID);
                stack.push(new Value("%" + (Generator.reg - 1), "FLOAT", value.size));
            }
            case "LONG" -> {
                Generator.load_long(ID);
                stack.push(new Value("%" + (Generator.reg - 1), "LONG", value.size));
            }
        }
    }



    @Override
    public void exitRead(MyLangParser.ReadContext context) {
        System.out.println("<< EXITING: read");
        System.out.println("Context text: " + context.getText());
        String ID = context.ID().getText();
        Value value = new Value(ID, "STRING", 127);
        variables.put(ID, value);
        Generator.scanf(ID, 127);
    }

    @Override
    public void exitAndExpr(MyLangParser.AndExprContext context) {
        Value right = stack.pop();
        Value left = stack.pop();
        boolean result = (left.toBoolean() && right.toBoolean());
        stack.push(new Value(result));
    }

    @Override
    public void exitOrExpr(MyLangParser.OrExprContext context) {
        Value right = stack.pop();
        Value left = stack.pop();
        boolean result = (left.toBoolean() || right.toBoolean());
        stack.push(new Value(result));
    }

    @Override
    public void exitXorExpr(MyLangParser.XorExprContext context) {
        Value right = stack.pop();
        Value left = stack.pop();
        boolean result = (left.toBoolean() ^ right.toBoolean());
        stack.push(new Value(result));
    }

    @Override
    public void exitNegExpr(MyLangParser.NegExprContext context) {
        Value val = stack.pop();
        stack.push(new Value(!val.toBoolean()));
    }


    @Override
    public void enterArray(MyLangParser.ArrayContext context) {
        final var id = "arr" + (Generator.arr - 1);
        final var array = new Array(id, "UNKNOWN", 0);
        arrayStack.push(array);
        Generator.arr++;
    }

    @Override
    public void exitArray(MyLangParser.ArrayContext context) {
        final var array = arrayStack.pop();
        Generator.declare_array(array.name, array.size, array.type);
        for (var index = 0; index < array.size; index++) {
            final var value = array.values.get(index);
            Generator.assign_array_item(array.name, array.size, String.valueOf(index), value.name, value.type);
        }
        if (context.getParent() instanceof MyLangParser.ArrayItemContext) {
            return;
        }
        stack.push(array);
    }

    @Override
    public void exitArrayElement(MyLangParser.ArrayElementContext context) {

        System.out.println("==== exitArrayElement ====");
        System.out.println("Stack size before pop: " + stack.size());


        System.out.println("Context text: " + context.getText());
        final var value = stack.pop();
        final var array = arrayStack.peek();
        array.values.add(value);
        array.size++;
        if (array.type.equals("UNKNOWN")) {
            array.type = value.type;
            return;
        }
        if (!array.type.equals(value.type)) {
            error(context.getStart().getLine(), "Array and item types are different");
        }
    }

    @Override
    public void exitArrayItem(MyLangParser.ArrayItemContext context) {
        final var array = variables.get(context.ID().getText());
        if (array == null) {
            error(context.getStart().getLine(), "Array not defined " + context.getText());
        }
        final var index = stack.pop();
        if (!index.type.equals("INT")) {
            error(context.getStart().getLine(), "Array index must be int");
        }
        Generator.load_array_value(array.name, array.size, index.name, array.type);
        stack.push(new Value("%" + (Generator.reg - 1), array.type));
    }

    @Override
    public void exitAssignArray(MyLangParser.AssignArrayContext context) {
        final var ID = context.ID().getText();
        final var array = variables.get(ID);
        if (array == null) {
            error(context.getStart().getLine(), "Array with ID: " + ID + " is not defined");
        }
        final var value = stack.pop();
        final var index = stack.pop();
        if (!index.type.equals("INT")) {
            error(context.getStart().getLine(), "Array index must be int");
        }
        if (!value.type.equals(array.type)) {
            error(context.getStart().getLine(), "Array and array element type is not the same");
        }
        Generator.assign_array_item(array.name, array.size, index.name, value.name, value.type);
    }

    void error(int line, String msg) {
        System.err.println("Error in line number: " + line + ", " + msg);
        System.exit(1);
    }
}
