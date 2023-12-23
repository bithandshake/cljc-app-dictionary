
(ns app-dictionary.side-effects
    (:require [app-dictionary.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn add-term!
  ; @description
  ; Adds a single term to a dictionary.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (keyword) term-id
  ; @param (map) term
  ;
  ; @usage
  ; (add-term! :my-term {:en "My term"})
  ;
  ; @usage
  ; (add-term! :my-dictionary :my-term {:en "My term"})
  ([term-id term]
   (add-term! :global term-id term))

  ([dictionary-id term-id term]
   (swap! state/TERM-COLLECTIONS assoc-in [dictionary-id term-id] term)))

(defn add-terms!
  ; @description
  ; Adds multiple terms to a dictionary.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (map) terms
  ;
  ; @usage
  ; (add-terms! {:my-term {:en "My term"}})
  ;
  ; @usage
  ; (add-terms! :my-dictionary {:my-term {:en "My term"}})
  ([terms]
   (add-terms! :global terms))

  ([dictionary-id terms]
   (swap! state/TERM-COLLECTIONS update dictionary-id merge terms)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn select-language!
  ; @description
  ; Sets the language for a dictionary.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (keyword) language-id
  ;
  ; @usage
  ; (language-id! :en)
  ;
  ; @usage
  ; (language-id! :my-dictionary :en)
  ([language-id]
   (select-language! :global language-id))

  ([dictionary-id language-id]
   (swap! state/SELECTED-LANGUAGE assoc dictionary-id language-id)))
