(ns clojure-dsl.core
  (:gen-class))

(defn emit-bash-form
  [a]
  (condp = (class a)
    clojure.lang.PersistentList
    (condp = (name (first a))
      "println" (str "echo " (second a))
      nil)
    java.lang.String a
    java.lang.Integer (str a)
    java.lang.Long (str a)
    java.lang.Double (str a)
    nil))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
