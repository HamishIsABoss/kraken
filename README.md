# Kraken - Vainglory API Wrapper

Kraken is a wrapper of the official [Vainglory API](https://developer.vainglorygame.com/).

This version of Kraken implements the core endpoints of the API, such as matches, players and samples.

*Please note: this is my non-exercise program in Clojure - chances are it is pretty bad...*

# Installation

Add the following dependecy to your `project.clj` file.

```clojure
[org.clojars.hamish/kraken "1.0.0"]
```

# Examples

```clojure
;; Store API key for later use
(def my-api-key "XXX-SECRET-XXX")

;; Get data for all matches on the North America server without parameters
(matches my-api-key "na")

;; Optional parameters can be supplied
(def my-match-params {"sort" "createdAt"
                      "filter[playerNames]" "genericPLayerName"
                      "filter[createdAt-start]" "2017-02-28T13:25:30Z"
                      "page[limit]" "3"})

(matches my-api-key "na" my-match-params)
```
