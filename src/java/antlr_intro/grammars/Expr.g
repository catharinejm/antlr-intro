grammar Expr;
options {
    output=AST;
    ASTLabelType=CommonTree;
}

@header {
package antlr_intro.grammars;

import java.util.HashMap;
}

@members {
HashMap memory = new HashMap();
}

@lexer::header {package antlr_intro.grammars;}

prog:   ( stat {System.out.println($stat.tree==null?"null":$stat.tree.toStringTree());} )+ ;

stat:   expr NEWLINE        -> expr
    |   ID '=' expr NEWLINE -> ^('=' ID expr)
    |   NEWLINE             ->
    ;

expr:   multExpr (('+'^|'-'^) multExpr)*
    ;

multExpr
    :   atom ('*'^ atom)*
    ;

atom:   INT
    |   ID
    |   '('! expr ')'!
    ;

ID  : ('a'..'z'|'A'..'Z')+ ;
INT : '0'..'9'+ ;
NEWLINE: '\r'? '\n' ;
WS  : (' '|'\t')+ {skip();} ;
