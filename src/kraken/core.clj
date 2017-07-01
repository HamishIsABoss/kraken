(ns kraken.core
  (:require [clj-http.lite.client :as client]
            [cheshire.core :refer :all]))

;; Utilities

(defn- url
  [region endpoint]
  (str "https://api.dc01.gamelockerapp.com/shards/" region "/" endpoint))

(defn- headers
  [api-key]
  {"Authorization" api-key
   "Accept" "application/vnd.api+json"})

;; API

(defn api-response
  [url headers & params]
  (client/get url {:headers headers
                   :params params}))

(defn- plural-endpoint
  [endpoint]
  (fn [api-key region & params]
    (->
      (url region endpoint)
      (api-response (headers api-key) params)
      :body
      (parse-string true))))

(defn- singular-endpoint
  [endpoint]
  (fn [api-key region id]
    (->
      (url region (str endpoint "/" id))
      (api-response (headers api-key))
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

