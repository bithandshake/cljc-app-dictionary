
(ns dictionary.env
    (:require [dictionary.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn look-up
  ; @description
  ; Looks up a specific term in the global dictionary or a specific dictionary in the selected language.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (keyword) term-id
  ;
  ; @example
  ; (look-up :apple)
  ; =>
  ; "Alma"
  ;
  ; @example
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
  ; Looks up a specific term in the global dictionary or a specific dictionary in the provided language.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (keyword) term-id
  ; @param (keyword) language-id
  ;
  ; @example
  ; (translate :apple :hu)
  ; =>
  ; "Alma"
  ;
  ; @example
  ; (translate :my-dictionary :apple :hu)
  ; =>
  ; "Alma"
  ;
  ; @return (string)
  ([term-id language-id]
   (translate :global term-id language-id))

  ([dictionary-id term-id language-id]
   (get-in @state/TERM-COLLECTION [dictionary-id term-id language-id])))
