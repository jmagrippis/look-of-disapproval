(ns look-of-disapproval.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as middleware]))

(defroutes app-routes
  (GET "/" [] "ಠ_ಠ")
  (GET "/slack" [] {:status 200
                    :body {:response_type "in_channel"
                           :text "ಠ_ಠ"}})
  (route/not-found "Not Found"))

(def app
  (-> (handler/site app-routes)
      (middleware/wrap-json-body {:keywords? true})
      middleware/wrap-json-response))
