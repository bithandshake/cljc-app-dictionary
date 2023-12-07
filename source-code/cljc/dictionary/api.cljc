
(ns dictionary.api
    (:require [dictionary.env          :as env]
              [dictionary.side-effects :as side-effects]
              [dictionary.state        :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (dictionary.env)
(def look-up   env/look-up)
(def translate env/translate)

; @redirect (dictionary.side-effects)
(def add-term!        side-effects/add-term!)
(def add-terms!       side-effects/add-terms!)
(def select-language! side-effects/select-language!)

; @redirect (dictionary.state)
(def TERM-COLLECTION   state/TERM-COLLECTION)
(def SELECTED-LANGUAGE state/SELECTED-LANGUAGE)
