(ns reagent-lifecycle-methods-practice.application
  (:require [reagent-lifecycle-methods-practice.state :as s]
            [reagent-lifecycle-methods-practice.counter :as c]))

(def style {:margin-top "40"
            :margin-bottom "10"})

(defn show-button []
  [:input {:type "button"
           :class "btn btn-default"
           :value @s/show-hidden?
           :on-click (fn [e]
                       (if @s/hidden?
                         (do
                           (reset! s/hidden? false)
                           (reset! s/show-hidden? "Show"))
                         (do
                           (reset! s/hidden? true)
                           (reset! s/show-hidden? "Hide"))
                         ))}])

(defn increment-button []
  [:input {:type "button"
           :class "btn btn-success"
           :value "Increment"
           :on-click (fn [e]
                       (swap! s/click-count inc))}])

(defn application []
  [:div.container
   [:div.row
    [:div {:class "col-md-6 col-md-offset-6 text-center"}
     [:p {:style style} "Make sure to open Developer Tools Console before you click anything."]
     [:div {:class "btn-group btn-group-lg"
            :group "role"
            :style style}
      [show-button]
      [increment-button]
      (if @s/hidden?
        [c/counter]
        nil)]]]])
