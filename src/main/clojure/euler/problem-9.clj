(ns euler.problem-8)
(use 'clojure.contrib.lazy-seqs)
(println (time (reduce + (take-while #(< % 2000000) primes))))
