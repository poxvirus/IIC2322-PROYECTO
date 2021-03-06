%Object = type { i8*}
%IO = type { i8*}
%Program = type { i8*, %Brocoli*}
%Brocoli = type { i8*}

@.empty_str = private unnamed_addr constant [1 x i8] c"\00"
@_type_Object = internal constant [7 x i8] c"Object\00"
@_type_IO = internal constant [3 x i8] c"IO\00"
@_type_Program = internal constant [8 x i8] c"Program\00"
@_type_Brocoli = internal constant [8 x i8] c"Brocoli\00"
@_string_0 = internal constant [37 x i8] c"What a terrible night to be cursed!\0A\00"

define i32 @main()
{
	%mainClass = call %Program* @_newProgram()
	call %Object* @Program_main(%Program* %mainClass)
	ret i32 0
}

define %IO* @_newIO()
{
	%vptr = call i8* @malloc(i64 ptrtoint (%IO* getelementptr (%IO* null , i32 1) to i64))
	%self = bitcast i8* %vptr to %IO*
	%class_type = getelementptr %IO* %self, i32 0, i32 0
	store i8* bitcast([3 x i8]* @_type_IO to i8*), i8** %class_type

	ret %IO* %self
}


define %Program* @_newProgram()
{
	%vptr = call i8* @malloc(i64 ptrtoint (%Program* getelementptr (%Program* null , i32 1) to i64))
	%self = bitcast i8* %vptr to %Program*
	%class_type = getelementptr %Program* %self, i32 0, i32 0
	store i8* bitcast([8 x i8]* @_type_Program to i8*), i8** %class_type

	%_var1 = getelementptr inbounds %Program* %self, i32 0, i32 1
	%_var0 = call %Brocoli* @_newBrocoli()
	store %Brocoli* %_var0, %Brocoli** %_var1
	ret %Program* %self
}


define %Brocoli* @_newBrocoli()
{
	%vptr = call i8* @malloc(i64 ptrtoint (%Brocoli* getelementptr (%Brocoli* null , i32 1) to i64))
	%self = bitcast i8* %vptr to %Brocoli*
	%class_type = getelementptr %Brocoli* %self, i32 0, i32 0
	store i8* bitcast([8 x i8]* @_type_Brocoli to i8*), i8** %class_type

	ret %Brocoli* %self
}


define %Object* @Program_main(%Program* %self)
{
	%_var2 = getelementptr inbounds %Program* %self, i32 0, i32 1
	%_var3 = load %Brocoli** %_var2
	%_var5 = call %IO* @_newIO()
	%_var4 = call %Object* @Brocoli_print(%Brocoli* %_var3, %IO* %_var5)

	ret %Object* %_var4
}


define %Object* @Brocoli_print(%Brocoli* %self, %IO* %_Brocoli_iostream)
{
	%_Brocoli_print_iostream = alloca %IO*, align 4
	store %IO* %_Brocoli_iostream, %IO** %_Brocoli_print_iostream
	%_var6 = load  %IO** %_Brocoli_print_iostream
	%_var8 = bitcast [37 x i8]* @_string_0 to i8*

	%_var7 = call %IO* @IO_out_string(%IO* %_var6, i8* %_var8)

	%_var9 = bitcast %IO* %_var7 to %Object*
	ret %Object* %_var9
}



declare %Object* @Object_abort(%Object*)
declare i8* @Object_type_name(%Object*)
declare %IO* @IO_out_string(%IO*, i8*)
declare i8* @IO_in_string(%IO*)
declare %IO* @IO_out_int(%IO*, i32)
declare i32 @IO_in_int(%IO*)
declare i32 @String_length(i8*)
declare i8* @String_concat(i8*, i8*)
declare i8* @String_substr(i8*, i32, i32)
declare i32 @strcmp(i8*, i8*)
declare i8* @malloc(i64)

