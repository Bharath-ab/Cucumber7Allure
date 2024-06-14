@sample
Feature: Google search scenario example
  @sample
  Scenario Outline: User search in google with scenario Outline
    Given User launch "chrome" browser
    Then User navigate to url "https://www.google.com/"
    Then User search for text "<animal>"
    Then User verify page is opened

    Examples:
      | animal |
      | cat    |
      | dog    |
      | fox    |
