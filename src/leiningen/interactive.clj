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
            (let [[task-name & args] (clojure.string/split input #"\s+")]
                 (leiningen.core.main/apply-task
                   task-name
                   (leiningen.core.project/read)
                   args))
            (catch clojure.lang.ExceptionInfo e nil)
            (catch Exception e (prn 'oh e)))
          :else (prn 'omg2))))
    (recur)))
