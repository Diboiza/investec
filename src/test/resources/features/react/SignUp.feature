Feature: Sign Up for insights

@SanityTest
  Scenario Outline: Navigate to the cash investment rates page and signup
    Given : User navigates to the cash investment rates page
    When : The click the sign up button
    And : fill in the form with "<name>" "<surname>" "<email>"
    Then : A Thank you message should be displayed

  Examples:
  |name|surname|email|
  |Bongani|Maphiri|test@investec.co.za|