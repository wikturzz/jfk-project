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

    static void mult_double(String val1, String val2) {
        main_text += "%" + reg + " = fmul double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void sitofp(String id) {
        main_text += "%" + reg + " = sitofp i32 " + id + " to double\n";
        reg++;
    }

    static void fptosi(String id) {
        main_text += "%" + reg + " = fptosi double " + id + " to i32\n";
        reg++;
    }

    static void assign_string(String id, String value) {
        if (!value.startsWith("%")) value = "%" + value;

        String bitcastReg = "%" + reg;
        main_text += bitcastReg + " = bitcast [" + (value.length() + 1) + " x i8]* " + value + " to i8*\n";
        reg++;

        main_text += "store i8* " + bitcastReg + ", i8** %" + id + "\n";
    }

    static void load_string(String id) {
        main_text += "%" + reg + " = load i8*, i8** %" + id + "\n";
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

    static void div_double(String val1, String val2) {
        main_text += "%" + reg + " = fdiv double " + val2 + ", " + val1 + "\n";
        reg++;
    }

    static void allocate_string(String id, int length) {
        main_text += "%" + id + " = alloca [" + (length + 1) + " x i8]\n";
    }

    static void printf_string(String id) {
        load_string(id);
        main_text += "%" + reg +
                " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %" +
                (reg - 1) + ")\n";
        reg++;
    }

    static void constant_string(String content) {
        final int length = content.length() + 1;
        header_text += "@str" + str + " = constant [" + length + " x i8] c\"" + content + "\\00\"\n";

        final String id = "str" + str;
        Generator.allocate_string(id, length - 1);

        main_text += "%" + reg + " = bitcast [" + length + " x i8]* %" + id + " to i8*\n";

        main_text += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %" + reg +
                ", i8* align 1 getelementptr inbounds ([" + length + " x i8], [" + length +
                " x i8]* @" + id + ", i32 0, i32 0), i64 " + length + ", i1 false)\n";
        reg++;

        str++;
    }

    static void scanf(String id, int length) {
        allocate_string("str" + str, length);

        main_text += "%" + id + " = alloca i8*\n";

        main_text += "%" + reg + " = getelementptr inbounds [" + (length + 1) + " x i8], [" + (length + 1) +
                " x i8]* %str" + str + ", i64 0, i64 0\n";
        reg++;

        main_text += "store i8* %" + (reg - 1) + ", i8** %" + id + "\n";

        str++;

        main_text += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strs, i32 0, i32 0), i8* %" +
                (reg - 1) + ")\n";
        reg++;
    }

    static void declare_array(String id, int size, String type) {
        main_text += "%" + id + " = alloca [" + size + " x " + get_type(type) + "]\n";
    }

    static void assign_array_item(String id, int length, String index, String value, String type) {
        main_text += "%" + reg + " = getelementptr inbounds [" + length + " x " + get_type(type) + "], [" +
                length + " x " + get_type(type) + "]* %" + id + ", i64 0, i64 " + index + "\n";
        main_text += "store " + get_type(type) + " " + value + ", " + get_type(type) + "* %" +  reg + "\n";
        reg++;
    }

    static void load_array_value(String id, int length, String index, String type) {
        main_text += "%" + reg + " = getelementptr inbounds [" + length + " x " + get_type(type) + "], [" +
                length + " x " + get_type(type) + "]* %" + id + ", i64 0, i64 " + index + "\n";
        reg++;
        main_text += "%" + reg + " = load " + get_type(type) + ", " + get_type(type) + "* %" + (reg - 1) + "\n";
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

    // NOWE METODY - LOGICAL OPERATORS

    // AND operation
    static void and_i32(String val1, String val2) {
        main_text += "%" + reg + " = and i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // OR operation
    static void or_i32(String val1, String val2) {
        main_text += "%" + reg + " = or i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // XOR operation
    static void xor_i32(String val1, String val2) {
        main_text += "%" + reg + " = xor i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // NEG (NOT) operation
    static void not_i32(String val) {
        main_text += "%" + reg + " = sub i32 1, " + val + "\n";
        reg++;
    }

    static String generate() {
        return "declare i32 @printf(i8*, ...)\n" +
                "declare i32 @sprintf(i8*, i8*, ...)\n" +
                "declare i8* @strcpy(i8*, i8*)\n" +
                "declare i8* @strcat(i8*, i8*)\n" +
                "declare i32 @scanf(i8*, ...)\n" +
                "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n" +
                "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n" +
                "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n" +
                "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n" +
                "@strs = constant [5 x i8] c\"%10s\\00\"\n" +
                "@strspi = constant [3 x i8] c\"%d\\00\"\n" +
                header_text +
                "define i32 @main() nounwind{\n" +
                main_text +
                "ret i32 0 }\n";
    }
}