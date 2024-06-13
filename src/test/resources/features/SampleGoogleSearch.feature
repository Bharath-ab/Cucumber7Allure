@sample
  Feature: Sample Google search
    Scenario: User search in google
      Given User launch "chrome" browser
      Then User navigate to url "https://www.google.com/"
      Then User search for text "cat"
      Then User verify page is opened
      Then User close the browser