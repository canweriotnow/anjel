(defproject anjel "0.1.0-SNAPSHOT"
  :description "A Clojure client for the AngelList API"
  :url "https://github.com/canweriotnow/anjel"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "0.7.7"] ;; Replace w/ http-kit
                 [http-kit "2.1.18"] ;; Replace calls to clj-http
                 [org.clojure/data.json "0.2.3"] ;; Replace w/ cheshire
                 [cheshire "5.6.3"] ;; Replacing data.json
                 ])
