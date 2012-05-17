(ns antlr-intro.core
  (:import [org.antlr.runtime ANTLRInputStream CommonTokenStream]
           [antlr_intro.grammars ExprLexer ExprParser]))

(defn -main []
  (let [input (ANTLRInputStream. System/in)
        lexer (ExprLexer. input)
        tokens (CommonTokenStream. lexer)
        parser (ExprParser. tokens)]
    (.prog parser)))
