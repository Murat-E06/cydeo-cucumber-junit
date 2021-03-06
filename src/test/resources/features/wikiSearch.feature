Feature: Wikipedia search functionality and verifications

  # WSF-45345 (potential jira ticket number veriliyormus sonradan cagirmak icin)


  Scenario: Wikipedia Search Functionality Title Verification2
    Given User is on Wikipedia home page2
    When User types "Samsun" in the wiki search box2
    And User clicks wiki search button
    Then User sees "Samsun" is in the wiki title

  Scenario: Wikipedia Search Functionality Title verifications
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

    @scenarioTemplate
  Scenario Template: Wikipedia Search Functionality Title verifications
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this  scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Antony Hopkins    | Antony Hopkins    | Antony Hopkins     |
