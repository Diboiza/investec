Feature: Apply for Job Opening

  @SanityTest
  Scenario Outline: Launch Browser and Navigate to iLab Homepage
    Given : User navigates to the investec website
    When : They click on the search link
    And : Searches for "<searchText>"
    And : We should get a link that has points to "<linkAddress>"

    Examples:
    |searchText                 |linkAddress|
    |understanding interest rates|https://www.investec.com/en_za/focus/money/understanding-interest-rates.html|


