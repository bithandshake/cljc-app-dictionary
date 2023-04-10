
(ns dictionary.env
    (:require [dictionary.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn translate
  ; @param (map) term
  ;
  ; @example
  ; (translate {:en "Apple" :hu "Alma"})
  ; =>
  ; "Apple"
  ;
  ; @return (string)
  [term]
  (get term @state/SELECTED-LANGUAGE))

(defn look-up
  ; @param (keyword) term-id
  ;
  ; @example
  ; (look-up :apple)
  ; =>
  ; "Alma"
  ;
  ; @return (string)
  [term-id]
  (get-in @state/TERM-COLLECTION [term-id @state/SELECTED-LANGUAGE]))
