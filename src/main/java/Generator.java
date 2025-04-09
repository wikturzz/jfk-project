class Generator {

    static String header_text = "";
    static String main_text = "";
    static int reg = 1;
    static int str = 1;
    static int arr = 1;

    // Printf for INT
    static void printf_i32(String id) {
        load_i32(id);
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
        reg++;
    }

    // Printf for LONG (i64)
    static void printf_long(String id) {
        load_long(id);
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i64 %" + (reg - 1) + ")\n";
        reg++;
    }

    // Printf for FLOAT
    static void printf_float(String id) {
        load_float(id);
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpf, i32 0, i32 0), float %" + (reg - 1) + ")\n";
        reg++;
    }

    // Printf for DOUBLE
    static void printf_double(String id) {
        load_double(id);
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    // Printf for STRING
    static void printf_string(String id) {
        load_string(id);
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %" + (reg - 1) + ")\n";
        reg++;
    }

    // Declare INT
    static void declare_i32(String id) {
        main_text += "%" + id + " = alloca i32\n";
    }

    // Declare LONG (i64)
    static void declare_long(String id) {
        main_text += "%" + id + " = alloca i64\n";
    }

    // Declare FLOAT
    static void declare_float(String id) {
        main_text += "%" + id + " = alloca float\n";
    }

    // Declare DOUBLE
    static void declare_double(String id) {
        main_text += "%" + id + " = alloca double\n";
    }

    // Declare STRING
    static void declare_string(String id) {
        main_text += "%" + id + " = alloca i8*\n";
    }

    // Assign INT
    static void assign_i32(String id, String value) {
        main_text += "store i32 " + value + ", i32* %" + id + "\n";
    }

    // Assign LONG (i64)
    static void assign_long(String id, String value) {
        main_text += "store i64 " + value + ", i64* %" + id + "\n";
    }

    // Assign FLOAT
    static void assign_float(String id, String value) {
        main_text += "store float " + value + ", float* %" + id + "\n";
    }

    // Assign DOUBLE
    static void assign_double(String id, String value) {
        main_text += "store double " + value + ", double* %" + id + "\n";
    }

    // Assign STRING
    static void assign_string(String id, String value) {
        main_text += "store i8* " + value + ", i8** %" + id + "\n";
    }

    // Load INT
    static void load_i32(String id) {
        main_text += "%" + reg + " = load i32, i32* %" + id + "\n";
        reg++;
    }

    // Load LONG (i64)
    static void load_long(String id) {
        main_text += "%" + reg + " = load i64, i64* %" + id + "\n";
        reg++;
    }

    // Load FLOAT
    static void load_float(String id) {
        main_text += "%" + reg + " = load float, float* %" + id + "\n";
        reg++;
    }

    // Load DOUBLE
    static void load_double(String id) {
        main_text += "%" + reg + " = load double, double* %" + id + "\n";
        reg++;
    }

    // Load STRING
    static void load_string(String id) {
        main_text += "%" + reg + " = load i8*, i8** %" + id + "\n";
        reg++;
    }

    // Add INT
    static void add_i32(String val1, String val2) {
        main_text += "%" + reg + " = add i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // Add LONG (i64)
    static void add_long(String val1, String val2) {
        main_text += "%" + reg + " = add i64 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // Add FLOAT
    static void add_float(String val1, String val2) {
        main_text += "%" + reg + " = fadd float " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // Add DOUBLE
    static void add_double(String val1, String val2) {
        main_text += "%" + reg + " = fadd double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // Multiply INT
    static void mult_i32(String val1, String val2) {
        main_text += "%" + reg + " = mul i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // Multiply LONG (i64)
    static void mult_long(String val1, String val2) {
        main_text += "%" + reg + " = mul i64 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // Multiply FLOAT
    static void mult_float(String val1, String val2) {
        main_text += "%" + reg + " = fmul float " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // Multiply DOUBLE
    static void mult_double(String val1, String val2) {
        main_text += "%" + reg + " = fmul double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    // Subtract INT
    static void sub_i32(String val1, String val2) {
        main_text += "%" + reg + " = sub i32 " + val2 + ", " + val1 + "\n";
        reg++;
    }

    // Subtract LONG (i64)
    static void sub_long(String val1, String val2) {
        main_text += "%" + reg + " = sub i64 " + val2 + ", " + val1 + "\n";
        reg++;
    }

    // Subtract FLOAT
    static void sub_float(String val1, String val2) {
        main_text += "%" + reg + " = fsub float " + val2 + ", " + val1 + "\n";
        reg++;
    }

    // Subtract DOUBLE
    static void sub_double(String val1, String val2) {
        main_text += "%" + reg + " = fsub double " + val2 + ", " + val1 + "\n";
        reg++;
    }

    // Divide INT
    static void div_i32(String val1, String val2) {
        main_text += "%" + reg + " = sdiv i32 " + val2 + ", " + val1 + "\n";
        reg++;
    }

    // Divide LONG (i64)
    static void div_long(String val1, String val2) {
        main_text += "%" + reg + " = sdiv i64 " + val2 + ", " + val1 + "\n";
        reg++;
    }

    // Divide FLOAT
    static void div_float(String val1, String val2) {
        main_text += "%" + reg + " = fdiv float " + val2 + ", " + val1 + "\n";
        reg++;
    }

    // Divide DOUBLE
    static void div_double(String val1, String val2) {
        main_text += "%" + reg + " = fdiv double " + val2 + ", " + val1 + "\n";
        reg++;
    }

    // Helper to get the type in LLVM IR format
    static String get_type(String type) {
        return switch (type) {
            case "INT" -> "i32";
            case "LONG" -> "i64";
            case "FLOAT" -> "float";
            case "DOUBLE" -> "double";
            case "STRING" -> "i8*";
            default -> "";
        };
    }

    // Declare arrays
    static void declare_array(String name, int size, String type) {
        String llvmType = get_type(type) + "*";
        main_text += "%" + name + " = alloca [" + size + " x " + llvmType + "]\n";
    }

    // Assign value to an array element
    static void assign_array_item(String arrayName, int size, String index, String value, String type) {
        main_text += "store " + get_type(type) + " " + value + ", " + get_type(type) + "* getelementptr inbounds ([" + size + " x " + get_type(type) + "], [" + size + " x " + get_type(type) + "]* %" + arrayName + ", i32 0, i32 " + index + ")\n";
    }

    // Load array value
    static void load_array_value(String arrayName, int size, String index, String type) {
        main_text += "%" + reg + " = load " + get_type(type) + ", " + get_type(type) + "* getelementptr inbounds ([" + size + " x " + get_type(type) + "], [" + size + " x " + get_type(type) + "]* %" + arrayName + ", i32 0, i32 " + index + ")\n";
        reg++;
    }

    // Scan for INT
    static void scanf(String id, int maxLength) {
        main_text += "%" + reg + " = alloca [" + (maxLength + 1) + " x i8]\n";
        main_text += "%" + (reg + 1) + " = getelementptr inbounds [" + (maxLength + 1) + " x i8], [" + (maxLength + 1) + " x i8]* %" + reg + ", i32 0, i32 0\n";
        main_text += "%" + id + " = alloca i8*\n";
        main_text += "store i8* %" + (reg + 1) + ", i8** %" + id + "\n";
        main_text += "%" + (reg + 2) + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strs, i32 0, i32 0), i8* %" + (reg + 1) + ")\n";
        reg += 3;
    }


    // Final LLVM code generation
    static String generate() {
        return "declare i32 @printf(i8*, ...)\n" +
                "declare i32 @scanf(i8*, ...)\n" +
                "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n" +
                "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n" +
                "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n" +
                "@strpf = constant [4 x i8] c\"%f\\0A\\00\"\n" +
                "@strs = constant [5 x i8] c\"%10s\\00\"\n" +
                "@strspi = constant [3 x i8] c\"%d\\00\"\n" +
                header_text +
                "define i32 @main() nounwind{\n" +
                main_text +
                "ret i32 0 }\n";
    }
}
