(defproject clojureql "1.0.6"
  :description      "Superior SQL integration for Clojure"
  :url              "http://clojureql.sabrecms.com"
  :license          "MIT"
  :profiles       {:repl {:plugins [[cider/cider-nrepl "0.16.0"]]}}
  :dependencies     [[org.clojure/clojure         "1.9.0"]
                     [org.clojure/core.incubator  "0.1.4"]
                     [org.clojure/java.jdbc       "0.2.3"]
                     [org.clojure/tools.nrepl     "0.2.12"]
                     [mysql/mysql-connector-java  "5.1.17"]
                     [org.xerial/sqlite-jdbc      "3.7.2"]
                     ;; [postgresql/postgresql       "8.4-702.jdbc4"]
                     ;; 2025-08-24: recent lib, supporting support the SCRAM-SHA-256 authentication
                     [org.postgresql/postgresql "42.7.7"]
                     [org.apache.derby/derby      "10.1.1.0"]]
  :repositories {"clojure-releases"  {:url "http://build.clojure.org/releases"}
                 "clojure-snapshots"  {:url "http://build.clojure.org/snapshots"}})
