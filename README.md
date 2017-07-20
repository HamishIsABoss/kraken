# Kraken - Vainglory API Wrapper

Kraken is a wrapper of the official [Vainglory API](https://developer.vainglorygame.com/).

This version of Kraken implements the core endpoints of the API, such as matches, players and samples.

*Please note: this is my first non-exercise program in Clojure - chances are it is pretty bad...*

# Installation

Add the following dependecy to your `project.clj` file.

```clojure
[org.clojars.hamish/kraken "1.1.0"]
<<<<<<< HEAD
```
# Configuration

Kraken fetches your API key from your environment variables using [Environ](https://github.com/weavejester/environ). You can set your key in one of two ways.

In `~/.lein/profiles.clj`:

```clojure
{:user {:env {:forecast-key "xxx-secret-xxx"}}}
```

Or, set it as an environment variable:

```bash
VG_KEY=xxx-secret-xxx
=======
>>>>>>> 6affc6d4bdda3fcfb2281cbeeb17c3b42c3a750a
```
# Configuration

Kraken fetches your API key from your environment variables using [Environ](https://github.com/weavejester/environ). You can set your key in one of two ways.

In `~/.lein/profiles.clj`:

```clojure
<<<<<<< HEAD
=======
{:user {:env {:forecast-key "xxx-secret-xxx"}}}
```

Or, set it as an environment variable:
>>>>>>> 6affc6d4bdda3fcfb2281cbeeb17c3b42c3a750a

```bash
VG_KEY=xxx-secret-xxx
```

# Examples

```clojure
;; Get data for all matches on the North America server
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
(matches "na")
=======
=======
>>>>>>> e76a0794449a9f6e2fa6245bf6d33de601630da3
(matches my-api-key "na")
>>>>>>> e76a0794449a9f6e2fa6245bf6d33de601630da3
=======
(matches "na")
>>>>>>> 6affc6d4bdda3fcfb2281cbeeb17c3b42c3a750a

;; Optional parameters can be supplied
(def my-match-params {"sort" "createdAt"
                      "filter[playerNames]" "genericPLayerName"
                      "filter[createdAt-start]" "2017-02-28T13:25:30Z"
                      "page[limit]" "3"})

<<<<<<< HEAD
<<<<<<< HEAD
(matches "na" my-match-params)
=======
(matches my-api-key "na" my-match-params)
<<<<<<< HEAD
>>>>>>> e76a0794449a9f6e2fa6245bf6d33de601630da3
=======
>>>>>>> e76a0794449a9f6e2fa6245bf6d33de601630da3
=======
(matches "na" my-match-params)
>>>>>>> 6affc6d4bdda3fcfb2281cbeeb17c3b42c3a750a

;; Get data for an individual player
(def generic-player-id "RANDOM-ALPHANUMERIC-STRING")

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
(player "eu" generic-player-id)

;; Get data from randomly sampled matches
(samples "sa")
```
=======
=======
>>>>>>> e76a0794449a9f6e2fa6245bf6d33de601630da3
(player my-api-key "eu" generic-player-id)
=======
(player "eu" generic-player-id)
>>>>>>> 6affc6d4bdda3fcfb2281cbeeb17c3b42c3a750a

;; Get data from randomly sampled matches
(samples "sa")
```
>>>>>>> e76a0794449a9f6e2fa6245bf6d33de601630da3
