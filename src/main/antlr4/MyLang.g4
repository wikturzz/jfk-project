grammar MyLang;

prog: ( stat? NEWLINE )*
;

stat:	ID '=' expr0		#assign
        | ID '[' expr0 ']' '=' expr0	#assignArray
	    | PRINT ID   		#print
	    | READ ID           #read
;

expr0:  expr1			#single0
      | expr0 AND expr1     #andExpr
      | expr0 OR expr1      #orExpr
      | expr0 XOR expr1     #xorExpr
      | NEG expr0           #negExpr
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
       | TOFLOAT expr2     #tofloat
       | TOLONG expr2		#tolong
       | BOOL       #bool
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

TOFLOAT: '(float)'
    ;

TOLONG: '(long)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

INT: [0-9]+
    ;


DOUBLE: [0-9]+ '.' [0-9]+
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

AND: '&'
    ;

OR: '|'
    ;

XOR: '^'
    ;

NEG: '!'
    ;

BOOL: 'true' | 'false'
    ;
