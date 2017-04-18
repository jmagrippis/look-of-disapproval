(defproject look-of-disapproval "0.1.0-SNAPSHOT"
  :description "A modest endpoint that returns the infamous look of disapproval: ಠ_ಠ"
  :url "https://the-look-of-disapproval.herokuapp.com/"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [ring/ring-json "0.5.0-beta1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler look-of-disapproval.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
