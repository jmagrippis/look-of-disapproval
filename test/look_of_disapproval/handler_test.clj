(ns look-of-disapproval.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [look-of-disapproval.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "ಠ_ಠ"))))

  (testing "slack route returns a json response"
    (let [response (app (mock/request :post "/slack"))]
      (is (= (:status response) 200))
      (is (= (:body response) "{\"response_type\":\"in_channel\",\"text\":\"ಠ_ಠ\"}"))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
