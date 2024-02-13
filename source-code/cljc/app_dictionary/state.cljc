
(ns app-dictionary.state
    #?(:cljs (:require [reagent.api :refer [ratom]])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @description
; Stored multilingual terms.
;
; @atom (map)
;
; @usage
; (deref TERM-COLLECTIONS)
; =>
; {:my-dictionary {:my-term {:en "My term"}}}
(def TERM-COLLECTIONS #?(:clj  (atom  {})
                         :cljs (ratom {})))

; @description
; Selected language of the dictionary.
;
; @atom (map)
;
; @usage
; (deref SELECTED-LANGUAGE)
; =>
; {:my-dictionary :en}
(def SELECTED-LANGUAGE #?(:clj  (atom  {})
                          :cljs (ratom {})))
