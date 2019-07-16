Feature: the api greeting can be retrieved
  Scenario: client makes call to GET /
    When the client calls /
    Then the client receives status code of 200
    And the client receives welcome message