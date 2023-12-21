
(ns dictionary.state
    #?(:cljs (:require [reagent.api :refer [ratom]])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @atom (map)
;
; @usage
; (deref TERM-COLLECTIONS)
; =>
; {:my-dictionary {:my-term {:en "My term"}}}
(def TERM-COLLECTIONS #?(:clj  (atom  {})
                         :cljs (ratom {})))

; @atom (map)
;
; @usage
; (deref SELECTED-LANGUAGE)
; =>
; {:my-dictionary :en}
(def SELECTED-LANGUAGE #?(:clj  (atom  {})
                          :cljs (ratom {})))
