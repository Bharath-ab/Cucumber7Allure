@sample
Feature: Sample Google search

  @sample
  Scenario: User search in google
    Given User launch "chrome" browser
    Then User navigate to url "https://www.google.com/"
    Then User search for text "cat"
    Then User verify page is opened


  @sample
  Scenario: User search in google
    Given User launch "chrome" browser
    Then User navigate to url "https://www.google.com/"
    Then User search for text "dog"
    Then User verify page is opened

  @sample
  Scenario: User search in google
    Given User launch "fox" browser
    Then User navigate to url "https://www.google.com/"
    Then User search for text "dog"
    Then User verify page is opened

