(ns reagent-lifecycle-methods-practice.prod
  (:require
    [reagent-lifecycle-methods-practice.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
