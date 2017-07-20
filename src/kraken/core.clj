(ns kraken.core
  (:require [clj-http.lite.client :as client]
            [cheshire.core :refer :all]
            [environ.core :refer [env]]))

;; Utilities

(defn- url
  [region endpoint]
  (str "https://api.dc01.gamelockerapp.com/shards/" region "/" endpoint))

(def headers
  {"Authorization" (env :vg-key)
   "Accept" "application/vnd.api+json"})

;; API

(defn api-response
  "Returns raw data from endpoint"
  [url & params]
  (client/get url {:headers headers
                   :params params}))

(defn- plural-endpoint
  "Returns a function to get data from an endpoint that returns a collection of objects"
  [endpoint]
  (fn [region & params]
    (->
      (url region endpoint)
      (api-response params)
      :body
      (parse-string true))))

(defn- singular-endpoint
  "Returns a function to get data from an endpoint that returns a single object"
  [endpoint]
  (fn [region id]
    (->
      (url region (str endpoint "/" id))
      api-response
      :body
      (parse-string true))))

;; Endpoints

(def matches
  (plural-endpoint "matches"))

(def match
  (singular-endpoint "matches"))

(def players
  (plural-endpoint "players"))

(def player
  (singular-endpoint "players"))

(def samples
  (plural-endpoint "samples"))

