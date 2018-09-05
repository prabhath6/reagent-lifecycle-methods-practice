(ns reagent-lifecycle-methods-practice.state
  (:require [reagent.core :as r]))

(def show-hidden? (r/atom "Show"))
(def hidden? (r/atom false))
(def click-count (r/atom 0))

