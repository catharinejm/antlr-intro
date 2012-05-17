(ns antlr-intro.core
  (:import [org.antlr.runtime ANTLRInputStream CommonTokenStream]
           [org.antlr.runtime.tree CommonTree CommonTreeNodeStream]
           [antlr_intro.grammars ExprLexer ExprParser Eval]))

(defn -main []
  (let [parser (-> System/in ANTLRInputStream. ExprLexer. CommonTokenStream. ExprParser.)
        walker (-> (.. parser prog getTree) CommonTreeNodeStream. Eval.)]
    (.prog walker)))
