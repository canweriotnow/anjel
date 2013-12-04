(ns anjel.search
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(def ^:dynamic *search-url*
  "https://api.angel.co/1/search")

(defn- lookup-raw [entity-name entity-type]
  (let [typ (case entity-type
              :user "User"
              :startup "Startup")
        nym entity-name]
    (client/get *search-url*
                {:accept :json
                 :query-params {:query nym :type typ}})))

(defn lookup [entity-name entity-type]
  (json/read-str (:body (lookup-raw entity-name entity-type)) :key-fn keyword))





