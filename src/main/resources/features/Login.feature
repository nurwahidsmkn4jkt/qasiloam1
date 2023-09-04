Feature: Check login functionality
  Scenario: Login admin with valid username and password
    Given User access Siloam url
    When User enter valid admin username
    And User enter valid admin password
    And User click button login
    Then User should see text title page Home
    Then User should see Administrator text

  Scenario: Login sales with valid username and password
    Given User access Siloam url
    When User enter valid sales username
    And User enter valid sales password
    And User click button login
    Then User should see text title page Home
    Then User should see Profile Name text



