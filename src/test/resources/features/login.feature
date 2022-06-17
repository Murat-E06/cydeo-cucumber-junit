@Regression @Smoke @login
Feature: Library app login feature
  User story:
  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the library login page

  @librarian @employee @wip
  Scenario: Login as librarian
    #Buralarda Given vardı Backround a atınca (like a precondition) buralardan sildik!!
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student @db
  Scenario: Login as student
   #Given
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    #Given
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard