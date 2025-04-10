declare i32 @printf(i8*, ...)
declare i32 @sprintf(i8*, i8*, ...)
declare i8* @strcpy(i8*, i8*)
declare i8* @strcat(i8*, i8*)
declare i32 @scanf(i8*, ...)
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)
@strps = constant [4 x i8] c"%s\0A\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [5 x i8] c"%10s\00"
@strspi = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%x = alloca i32
store i32 10, i32* %x
%y = alloca double
store double 2.5, double* %y
%1 = load i32, i32* %x
%2 = load double, double* %y
%3 = fptosi double %2 to i32
%4 = add i32 %3, %1
%z = alloca i32
store i32 %4, i32* %z
%5 = load i32, i32* %z
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %5)
%arr = alloca i32
store i32 3, i32* %arr
%d = alloca i32
store i32 1, i32* %d
%7 = load i32, i32* %d
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
%str1 = alloca [128 x i8]
%inputVal = alloca i8*
%9 = getelementptr inbounds [128 x i8], [128 x i8]* %str1, i64 0, i64 0
store i8* %9, i8** %inputVal
%10 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strs, i32 0, i32 0), i8* %9)
%11 = load i8*, i8** %inputVal
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %11)
%13 = load i32, i32* %z
%14 = sitofp i32 %13 to double
%15 = fmul double 3.14, %14
%m = alloca double
store double %15, double* %m
%16 = load double, double* %m
%17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %16)
ret i32 0 }
