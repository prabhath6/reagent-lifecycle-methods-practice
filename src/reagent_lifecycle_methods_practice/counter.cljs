(ns reagent-lifecycle-methods-practice.counter
  (:require [reagent-lifecycle-methods-practice.state :as st]))

(defn counter []
  [:div
   [:h1.text-muted "Counter: " @st/click-count]])

