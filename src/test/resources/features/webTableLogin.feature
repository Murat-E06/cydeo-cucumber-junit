Feature: User should be able to login using correct credentials

  Background: user is on the login page
    Given user is on the login page of web table app


  Scenario: Positive login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks on login button
    Then user should url contains orders


  Scenario: Positive login scenario
    #Given user is on the login page of web table app//Bacrground a atınca buralardan sildik
    When user enters username "Test" password "Tester" and logins
    Then user should url contains orders

    #1. implement this new step
    #2. create login method in WebTableLoginPage
    #this login method should have multiple different overloaded version


  Scenario: User should be able to see all 12 months in months dropdown
    #Given user is on the login page of Web table app//aynı
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should url contains orders