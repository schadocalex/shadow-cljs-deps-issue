(ns app
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            ["@uiw/react-textarea-code-editor$default" :as CodeEditor]))

(defn root []
  [:div
   [:> CodeEditor {:value "(+ 1 2)"}]])

(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (rdom/render [root] (.getElementById js/document "root")))

(defn ^:export main
  "Run application startup logic."
  []
  (render))