(ns Euler-Clojure.test.core
  (:use [Euler-Clojure.core])
  (:use [clojure.test]))

(deftest problem-1
  (is (= 23 (euler-1 10))))
