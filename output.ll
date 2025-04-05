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
%arr0 = alloca [3 x i32]
%7 = getelementptr inbounds [3 x i32], [3 x i32]* %arr0, i64 0, i64 0
store i32 1, i32* %7
%8 = getelementptr inbounds [3 x i32], [3 x i32]* %arr0, i64 0, i64 1
store i32 2, i32* %8
%9 = getelementptr inbounds [3 x i32], [3 x i32]* %arr0, i64 0, i64 2
store i32 3, i32* %9
%10 = getelementptr inbounds [3 x i32], [3 x i32]* %arr0, i64 0, i64 1
%11 = load i32, i32* %10
%d = alloca i32
store i32 %11, i32* %d
%12 = load i32, i32* %d
%13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %12)
%str1 = alloca [128 x i8]
%inputVal = alloca i8*
%14 = getelementptr inbounds [128 x i8], [128 x i8]* %str1, i64 0, i64 0
store i8* %14, i8** %inputVal
%15 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strs, i32 0, i32 0), i8* %14)
%16 = load i8*, i8** %inputVal
%17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %16)
%18 = load i32, i32* %z
%19 = sitofp i32 %18 to double
%20 = fmul double 3.14, %19
%m = alloca double
store double %20, double* %m
%21 = load double, double* %m
%22 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %21)
ret i32 0 }
