(ns reagent-lifecycle-methods-practice.counter
  (:require [reagent-lifecycle-methods-practice.state :as st]
            [reagent.core :as r]))

(defn counter []
  (r/create-class
   {:component-did-mount
    (fn []
      (prn "Component Did mount"))

    :component-did-update
    (fn []
      (prn "Component Did update"))

    :component-will-unmount
    (fn []
      (prn "Component Did un-mount"))

    :reagent-render
    (fn []
      (prn "Component rendered")
      [:div
      [:h1.text-muted "Counter: " @st/click-count]])}))

