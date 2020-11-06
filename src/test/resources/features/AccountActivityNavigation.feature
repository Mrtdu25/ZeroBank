@account_activity
Feature: Navigating to specific accounts in Accounts Activity

 Background: common steps

   Given user is on the landing page
   When user logs in
   Then user should see ZeroBank homepage
  @savings_select
  Scenario: Savings account redirect

    When the user clicks on "Savings" link on the Account Summary page
    Then the "Account-Activity" page should be displayed
    And Account drop down should have "Savings" selected

  @brokerage_select
  Scenario: Brokerage account redirect

    When the user clicks on "Brokerage" link on the Account Summary page
    Then the "Account-Activity" page should be displayed
    And Account drop down should have "Brokerage" selected

  @checking_select
  Scenario: Checking account redirect

    When the user clicks on "Checking" link on the Account Summary page
    Then the "Account-Activity" page should be displayed
    And Account drop down should have "Checking" selected

  @credit_select
  Scenario: Credit Card account redirect

    When the user clicks on "Credit Card" link on the Account Summary page
    Then the "Account-Activity" page should be displayed
    And Account drop down should have "Credit Card" selected

  @loan_select
  Scenario: Loan account redirect

    When the user clicks on "Loan" link on the Account Summary page
    Then the "Account-Activity" page should be displayed
    And Account drop down should have "Loan" selected