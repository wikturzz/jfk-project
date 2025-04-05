grammar MyLang;

prog: ( stat? NEWLINE )*
;

stat:	ID '=' expr0		#assign
        | ID '[' expr0 ']' '=' expr0	#assignArray
	    | PRINT ID   		#print
	    | READ ID           #read
;

expr0:  expr1			#single0
      | expr1 ADD expr1	#add
      | expr1 SUBSTRACT expr1 #sub
;

expr1:  expr2			#single1
      | expr2 MULTIPLY expr2	#multiply
      | expr2 DIVIDE expr2 #divide
;

expr2:   INT			#int
       | DOUBLE			#double
       | ID             #id
       | ID '[' expr0 ']' #arrayItem
       | STRING #string
       | TOINT expr2		#toint
       | TODOUBLE expr2		#todouble
       | '[' array_element (',' array_element)* ']'      #array
       | '(' expr0 ')'		#par
;

array_element: expr0 #arrayElement
    ;

PRINT:	'print'
    ;

READ: 'read'
    ;

TOINT: '(int)'
    ;

TODOUBLE: '(double)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

DOUBLE: '0'..'9'+'.''0'..'9'+
    ;

INT: '0'..'9'+
    ;

ADD: '+'
    ;

MULTIPLY: '*'
    ;

NEWLINE:	'\r'? '\n'
    ;

SUBSTRACT: '-'
    ;

DIVIDE: '/'
    ;

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;