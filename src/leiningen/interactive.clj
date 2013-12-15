(ns leiningen.interactive
  (:require [leiningen.core.main]
            [leiningen.core.project]))

(defn interactive
  "Run leiningen tasks interactively"
  [project & args]
  (loop []
    (print "> ")
    (flush)
    (let [input (read-line)]
      (if-let [input* (try (read-string input) (catch Exception e (prn 'e e)))]
        (cond
          (= 'exit input*) (System/exit 0)
          (symbol? input*)
          (try
            (leiningen.core.main/apply-task
              (str input*)
              (leiningen.core.project/read)
              [])
            (catch clojure.lang.ExceptionInfo e nil))
          :else (prn 'omg2))

        (prn 'omg)))
    (recur)))
