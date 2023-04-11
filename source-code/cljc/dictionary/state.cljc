
(ns dictionary.state
    (:require [reagent.core :rename {atom ratom}]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @atom (map)
(def TERM-COLLECTION (atom {}))

; @atom (keyword)
(def SELECTED-LANGUAGE #?(:cljs (ratom nil)
                          :clj  (atom  nil)))
