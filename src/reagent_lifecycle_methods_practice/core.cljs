(ns reagent-lifecycle-methods-practice.core
    (:require
     [reagent.core :as r]
     [reagent-lifecycle-methods-practice.application :as a]))

;; -------------------------
;; Views

(defn home-page []
   [a/application])

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
