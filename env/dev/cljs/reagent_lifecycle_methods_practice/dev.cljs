(ns ^:figwheel-no-load reagent-lifecycle-methods-practice.dev
  (:require
    [reagent-lifecycle-methods-practice.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
