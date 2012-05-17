(defproject antlr-intro "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.antlr/antlr "3.4"]]
  :plugins [[lein-swank "1.4.4"]
            [lein-javac "1.2.1-SNAPSHOT"]]
  :main antlr-intro.core
  :extra-classpath-dirs ["parslex"])