
(ns dictionary.state
    #?(:cljs (:require [reagent.api :refer [ratom]])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @atom (map)
(def TERM-COLLECTION #?(:cljs (ratom {})
                        :clj  (atom  {})))

; @atom (map)
(def SELECTED-LANGUAGE #?(:cljs (ratom {})
                          :clj  (atom  {})))
