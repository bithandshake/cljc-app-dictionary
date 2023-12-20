
(ns dictionary.env
    (:require [dictionary.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn look-up
  ; @description
  ; Returns a specific term translated to the selected language.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (keyword) term-id
  ;
  ; @usage
  ; (look-up :apple)
  ; =>
  ; "Alma"
  ;
  ; @usage
  ; (look-up :my-dictionary :apple)
  ; =>
  ; "Alma"
  ;
  ; @return (string)
  ([term-id]
   (look-up :global term-id))

  ([dictionary-id term-id]
   (get-in @state/TERM-COLLECTION [dictionary-id term-id (dictionary-id @state/SELECTED-LANGUAGE)])))

(defn translate
  ; @description
  ; Returns a specific term translated to the given language.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (keyword) term-id
  ; @param (keyword) language-id
  ;
  ; @usage
  ; (translate :apple :hu)
  ; =>
  ; "Alma"
  ;
  ; @usage
  ; (translate :my-dictionary :apple :hu)
  ; =>
  ; "Alma"
  ;
  ; @return (string)
  ([term-id language-id]
   (translate :global term-id language-id))

  ([dictionary-id term-id language-id]
   (get-in @state/TERM-COLLECTION [dictionary-id term-id language-id])))
