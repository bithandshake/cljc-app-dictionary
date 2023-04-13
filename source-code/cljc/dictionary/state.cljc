
(ns dictionary.state
    (:require [reagent.core :rename {atom ratom}]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @atom (map)
(def TERM-COLLECTION #?(:cljs (ratom nil)
                        :clj  (atom  nil)))

; @atom (keyword)
(def SELECTED-LANGUAGE #?(:cljs (ratom nil)
                          :clj  (atom  nil)))
