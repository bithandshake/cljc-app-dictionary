
(ns app-dictionary.env
    (:require [app-dictionary.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn look-up
  ; @description
  ; Returns a specific term translated to the selected language read from a specific (or the global) dictionary.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (keyword) term-id
  ;
  ; @usage
  ; (look-up :my-term)
  ; =>
  ; "My term"
  ;
  ; @usage
  ; (look-up :my-dictionary :my-term)
  ; =>
  ; "My term"
  ;
  ; @return (string)
  ([term-id]
   (look-up :global term-id))

  ([dictionary-id term-id]
   (if-let [selected-language (dictionary-id @state/SELECTED-LANGUAGE)]
           (get-in @state/TERM-COLLECTIONS [dictionary-id term-id selected-language]))))

(defn translate
  ; @description
  ; Returns a specific term translated to the given language read from a specific (or the global) dictionary.
  ;
  ; @param (keyword)(opt) dictionary-id
  ; Default: :global
  ; @param (keyword) term-id
  ; @param (keyword) language-id
  ;
  ; @usage
  ; (translate :my-term :en)
  ; =>
  ; "My term"
  ;
  ; @usage
  ; (translate :my-dictionary :my-term :en)
  ; =>
  ; "My term"
  ;
  ; @return (string)
  ([term-id language-id]
   (translate :global term-id language-id))

  ([dictionary-id term-id language-id]
   (get-in @state/TERM-COLLECTIONS [dictionary-id term-id language-id])))
