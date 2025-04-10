class Generator {

    static String header_text = "";
    static String main_text = "";
    static int reg = 1;
    static int str = 1;
    static int arr = 1;

    static void printf_i32(String id) {
        load_i32(id);
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
        reg++;
    }

    static void printf_double(String id) {
        load_double(id);
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    static void declare_i32(String id) {
        main_text += "%" + id + " = alloca i32\n";
    }

    static void declare_double(String id) {
        main_text += "%" + id + " = alloca double\n";
    }

    static void declare_string(String id) {
        main_text += "%" + id + " = alloca i8*\n";
    }

    static void assign_i32(String id, String value) {
        main_text += "store i32 " + value + ", i32* %" + id + "\n";
    }

    static void assign_double(String id, String value) {
        main_text += "store double " + value + ", double* %" + id + "\n";
    }

    static void load_i32(String id) {
        main_text += "%" + reg + " = load i32, i32* %" + id + "\n";
        reg++;
    }

    static void load_double(String id) {
        main_text += "%" + reg + " = load double, double* %" + id + "\n";
        reg++;
    }

    static void add_i32(String val1, String val2) {
        main_text += "%" + reg + " = add i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void add_double(String val1, String val2) {
        main_text += "%" + reg + " = fadd double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void mult_i32(String val1, String val2) {
        main_text += "%" + reg + " = mul i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

        reg++;
    }

        reg++;
    }

        reg++;
    }

    static void sub_i32(String val1, String val2) {
        main_text += "%" + reg + " = sub i32 " + val2 + ", " + val1 + "\n";
        reg++;
    }

    static void sub_double(String val1, String val2) {
        main_text += "%" + reg + " = fsub double " + val2 + ", " + val1 + "\n";
        reg++;
    }

    static void div_i32(String val1, String val2) {
        main_text += "%" + reg + " = sdiv i32 " + val2 + ", " + val1 + "\n";
        reg++;
    }

        reg++;
    }

        reg++;
    }

        reg++;
    }

    static String get_type(String type) {
        return switch (type) {
            case "INT" -> "i32";
            case "DOUBLE" -> "double";
            case "STRING" -> "i8*";
            default -> "";
        };
    }


        reg++;
    }

    }


    static String generate() {
        return "declare i32 @printf(i8*, ...)\n" +
                "declare i32 @scanf(i8*, ...)\n" +
                "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n" +
                "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n" +
                "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n" +
                "@strs = constant [5 x i8] c\"%10s\\00\"\n" +
                "@strspi = constant [3 x i8] c\"%d\\00\"\n" +
                header_text +
                "define i32 @main() nounwind{\n" +
                main_text +
                "ret i32 0 }\n";
    }
}
