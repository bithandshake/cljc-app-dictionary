
(ns dictionary.side-effects
    (:require [dictionary.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn add-term!
  ; @param (keyword) term-id
  ; @param (map) term
  ;
  ; @usage
  ; (add-term! :my-term {:en "My term"})
  [term-id term]
  (swap! state/TERM-COLLECTION assoc term-id term))

(defn add-terms!
  ; @param (map) terms
  ;
  ; @usage
  ; (add-terms! {:my-term {:en "My term"}})
  [terms]
  (swap! state/TERM-COLLECTION merge terms))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn select-language!
  ; @param (keyword) language-id
  ;
  ; @usage
  ; (language-id! :en)
  [language-id]
  (reset! state/SELECTED-LANGUAGE language-id))
