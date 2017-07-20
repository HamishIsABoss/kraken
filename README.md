# Kraken

Kraken is a wrapper of the official [Vainglory API](https://developer.vainglorygame.com/).

This version of Kraken implements the core endpoints of the API, such as matches, players and samples and returns the data in a map.

# Installation

Add the following dependecy to your `project.clj` file.

```clojure
[org.clojars.hamish/kraken "1.1.0"]
```
# Configuration

Kraken fetches your API key from your environment variables using [Environ](https://github.com/weavejester/environ). You can set your key in one of two ways:

In `~/.lein/profiles.clj`:

```clojure
{:user {:env {:vg-key "xxx-secret-xxx"}}}
```

Or, set it as an environment variable:

```bash
VG_KEY=xxx-secret-xxx
```

# Examples

```clojure
;; Get data for NA matches
(matches "na")

;; Optional parameters can be supplied
(def my-match-params {"sort" "createdAt"
                      "filter[playerNames]" "genericPLayerName"
                      "filter[createdAt-start]" "2017-02-28T13:25:30Z"
                      "page[limit]" "3"})

(matches "na" my-match-params)

;; Get data for a player
(def player-id "RANDOM-ALPHANUMERIC-STRING")

(player "eu" player-id)

;; Get data from randomly sampled matches
(samples "ea")
```