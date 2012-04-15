(ns Euler-Clojure.core)

; Euler Problem #1
(defn euler-1 [n]
  (->> (range 1 n)
    (filter #(or (zero? (rem % 3))
                 (zero? (rem % 5))))
    (reduce +)))

; Euler Problem #2
(def fib-seq (lazy-cat [1 2] (map + (rest fib-seq) fib-seq)))
(defn euler-2 []
  (reduce + (filter even? (take-while #(< % 4000000) fib-seq))))
