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
        try {
            final var outputPath = Path.of("output.ll");
            final var llvmCode = Generator.generate();
            Files.writeString(outputPath, llvmCode);
        } catch (IOException ioException) {
            throw new IllegalStateException(ioException);
        }
    }

    @Override
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
        String type = variables.get(ID).type;
        if (variables.containsKey(ID)) {
            if (type != null) {
                switch (type) {
                    case "INT" -> Generator.printf_i32(ID);
                    case "DOUBLE" -> Generator.printf_double(ID);
                    case "STRING" -> Generator.printf_string(ID);
                }
            } else {
            }
        }
    }

    @Override
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
                Generator.add_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
                Generator.add_double(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
            }
        } else {
        }
    }

    @Override
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
                Generator.sub_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
                Generator.sub_double(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
            }
        } else {
        }
    }

    @Override
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
                Generator.mult_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
            }
                Generator.mult_double(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
            }
        } else {
        }
    }

    @Override
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type.equals(v2.type)) {
                Generator.div_i32(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "INT"));
            }
                Generator.div_double(v1.name, v2.name);
                stack.push(new Value("%" + (Generator.reg - 1), "DOUBLE"));
            }
        } else {
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
    public void exitRead(MyLangParser.ReadContext context) {
        String ID = context.ID().getText();
        Value value = new Value(ID, "STRING", 127);
        variables.put(ID, value);
        Generator.scanf(ID, 127);
    }

    @Override
    }

    @Override

            }
        }
    }

    @Override
        }
    }

    @Override
        }
    }

    void error(int line, String msg) {
        System.err.println("Error in line number: " + line + ", " + msg);
        System.exit(1);
    }
}
