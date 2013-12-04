(ns anjel.core
  (:require [anjel.search :as search]
            [anjel.startups :as startups]))

(defn find-startup [startup]
  (let [matches (search/lookup startup :startup)]
    (cond
     (empty? matches) nil
     :else (-> (first matches)
               (:id)
               (startups/find)))))

(find-startup "eduwampus")

(empty? (search/lookup "estuary" :startup))
