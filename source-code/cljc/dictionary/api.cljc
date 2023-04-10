
(ns dictionary.api
    (:require [dictionary.env          :as env]
              [dictionary.side-effects :as side-effects]
              [dictionary.state        :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; dictionary.env
(def translate env/translate)
(def look-up   env/look-up)

; dictionary.side-effects
(def add-term!        side-effects/add-term!)
(def add-terms!       side-effects/add-term!)
(def select-language! side-effects/select-language!)

; dictionary.state
(def TERM-COLLECTION   state/TERM-COLLECTION)
(def SELECTED-LANGUAGE state/SELECTED-LANGUAGE)
