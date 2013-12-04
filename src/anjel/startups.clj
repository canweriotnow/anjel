(ns anjel.startups
  (:refer-clojure :exclude [find])
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(def ^:dynamic *startup-url*
  "https://api.angel.co/1/startups")

(defn- find-raw [id]
  (client/get (str *startup-url* "/" id)))

(defn find [id]
  (json/read-str (:body (find-raw id)) :key-fn keyword))
