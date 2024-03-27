
(ns app-dictionary.api
    (:require [app-dictionary.env          :as env]
              [app-dictionary.side-effects :as side-effects]
              [app-dictionary.state        :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (app-dictionary.env/*)
(def look-up   env/look-up)
(def translate env/translate)
 
; @redirect (app-dictionary.side-effects/*)
(def add-term!        side-effects/add-term!)
(def add-terms!       side-effects/add-terms!)
(def select-language! side-effects/select-language!)

; @redirect (app-dictionary.state/*)
(def TERM-COLLECTIONS  state/TERM-COLLECTIONS)
(def SELECTED-LANGUAGE state/SELECTED-LANGUAGE)
