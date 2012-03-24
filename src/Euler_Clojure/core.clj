(ns Euler-Clojure.core)

; Euler Problem #1
(defn euler-1 [n]
  (->> (range 1 n)
    (filter #(or (zero? (rem % 3))
                 (zero? (rem % 5))))
    (reduce +)))
