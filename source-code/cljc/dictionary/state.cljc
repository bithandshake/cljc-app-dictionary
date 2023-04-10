
(ns dictionary.state
    (:require [reagent.core :rename {atom ratom}]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @atom (map)
(def TERM-COLLECTION (ratom {}))

; @atom (keyword)
(def SELECTED-LANGUAGE (ratom nil))
