
(ns dictionary.env
    (:require [dictionary.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn translate
  ; @param (map) term
  ; @param (keyword)(opt) language-id
  ;
  ; @example
  ; (translate {:en "Apple" :hu "Alma"})
  ; =>
  ; "Apple"
  ;
  ; @return (string)
  ([term]
   (translate term @state/SELECTED-LANGUAGE))

  ([term language-id]
   (get term language-id)))

(defn look-up
  ; @param (keyword) term-id
  ; @param (keyword)(opt) language-id
  ;
  ; @example
  ; (look-up :apple)
  ; =>
  ; "Alma"
  ;
  ; @return (string)
  ([term-id]
   (look-up term-id @state/SELECTED-LANGUAGE))
   
  ([term-id language-id]
   (get-in @state/TERM-COLLECTION [term-id language-id])))
