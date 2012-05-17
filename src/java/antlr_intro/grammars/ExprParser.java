// $ANTLR 3.4 src/java/antlr_intro/grammars/Expr.g 2012-05-16 22:49:40

package antlr_intro.grammars;

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NEWLINE=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "src/java/antlr_intro/grammars/Expr.g"; }


    HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // src/java/antlr_intro/grammars/Expr.g:15:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // src/java/antlr_intro/grammars/Expr.g:15:5: ( ( stat )+ )
            // src/java/antlr_intro/grammars/Expr.g:15:7: ( stat )+
            {
            // src/java/antlr_intro/grammars/Expr.g:15:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/java/antlr_intro/grammars/Expr.g:15:7: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog30);
            	    stat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "stat"
    // src/java/antlr_intro/grammars/Expr.g:17:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        Token ID2=null;
        int expr1 =0;

        int expr3 =0;


        try {
            // src/java/antlr_intro/grammars/Expr.g:17:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case INT:
            case 8:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==13) ) {
                    alt2=2;
                }
                else if ( (LA2_2==NEWLINE||(LA2_2 >= 10 && LA2_2 <= 12)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // src/java/antlr_intro/grammars/Expr.g:17:7: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_stat39);
                    expr1=expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat41); 

                    System.out.println(expr1);

                    }
                    break;
                case 2 :
                    // src/java/antlr_intro/grammars/Expr.g:18:7: ID '=' expr NEWLINE
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat51); 

                    match(input,13,FOLLOW_13_in_stat53); 

                    pushFollow(FOLLOW_expr_in_stat55);
                    expr3=expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat57); 

                    memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));

                    }
                    break;
                case 3 :
                    // src/java/antlr_intro/grammars/Expr.g:19:7: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat67); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "expr"
    // src/java/antlr_intro/grammars/Expr.g:22:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
    public final int expr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // src/java/antlr_intro/grammars/Expr.g:23:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
            // src/java/antlr_intro/grammars/Expr.g:23:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_expr92);
            e=multExpr();

            state._fsp--;


            value = e;

            // src/java/antlr_intro/grammars/Expr.g:24:9: ( '+' e= multExpr | '-' e= multExpr )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }
                else if ( (LA3_0==12) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // src/java/antlr_intro/grammars/Expr.g:24:13: '+' e= multExpr
            	    {
            	    match(input,11,FOLLOW_11_in_expr108); 

            	    pushFollow(FOLLOW_multExpr_in_expr112);
            	    e=multExpr();

            	    state._fsp--;


            	    value += e;

            	    }
            	    break;
            	case 2 :
            	    // src/java/antlr_intro/grammars/Expr.g:25:13: '-' e= multExpr
            	    {
            	    match(input,12,FOLLOW_12_in_expr128); 

            	    pushFollow(FOLLOW_multExpr_in_expr132);
            	    e=multExpr();

            	    state._fsp--;


            	    value -= e;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // src/java/antlr_intro/grammars/Expr.g:29:1: multExpr returns [int value] : e= atom ( '*' e= atom )* ;
    public final int multExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // src/java/antlr_intro/grammars/Expr.g:30:5: (e= atom ( '*' e= atom )* )
            // src/java/antlr_intro/grammars/Expr.g:30:7: e= atom ( '*' e= atom )*
            {
            pushFollow(FOLLOW_atom_in_multExpr168);
            e=atom();

            state._fsp--;


            value = e;

            // src/java/antlr_intro/grammars/Expr.g:30:35: ( '*' e= atom )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==10) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/java/antlr_intro/grammars/Expr.g:30:36: '*' e= atom
            	    {
            	    match(input,10,FOLLOW_10_in_multExpr173); 

            	    pushFollow(FOLLOW_atom_in_multExpr177);
            	    e=atom();

            	    state._fsp--;


            	    value *= e;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // src/java/antlr_intro/grammars/Expr.g:33:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
    public final int atom() throws RecognitionException {
        int value = 0;


        Token INT4=null;
        Token ID5=null;
        int expr6 =0;


        try {
            // src/java/antlr_intro/grammars/Expr.g:34:5: ( INT | ID | '(' expr ')' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case 8:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // src/java/antlr_intro/grammars/Expr.g:34:7: INT
                    {
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_atom202); 

                    value = Integer.parseInt((INT4!=null?INT4.getText():null));

                    }
                    break;
                case 2 :
                    // src/java/antlr_intro/grammars/Expr.g:35:7: ID
                    {
                    ID5=(Token)match(input,ID,FOLLOW_ID_in_atom212); 

                     
                                Integer v = (Integer)memory.get((ID5!=null?ID5.getText():null));
                                if (v!=null) value = v.intValue();
                                else System.err.println("undefined variable "+(ID5!=null?ID5.getText():null));
                            

                    }
                    break;
                case 3 :
                    // src/java/antlr_intro/grammars/Expr.g:42:7: '(' expr ')'
                    {
                    match(input,8,FOLLOW_8_in_atom232); 

                    pushFollow(FOLLOW_expr_in_atom234);
                    expr6=expr();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_atom236); 

                    value = expr6;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog30 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_expr_in_stat39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat51 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat53 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_stat55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr92 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_expr108 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr112 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_12_in_expr128 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr132 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_atom_in_multExpr168 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_multExpr173 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_multExpr177 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INT_in_atom202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom232 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom234 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom236 = new BitSet(new long[]{0x0000000000000002L});

}