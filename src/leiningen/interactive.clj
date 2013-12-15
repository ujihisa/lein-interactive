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
      (when-not (clojure.string/blank? input)
        (cond
          (= "exit" input) (System/exit 0)
          (string? input)
          (try
            (leiningen.core.main/apply-task
              input
              (leiningen.core.project/read)
              [])
            (catch clojure.lang.ExceptionInfo e nil)
            (catch Exception e (prn 'oh e)))
          :else (prn 'omg2))))
    (recur)))
