Feature: As a user i want to be able to login ZeroBank.

  @login
  Scenario: As a user i should be able to log in
    Given user is on the landing page
    When user logs in
    Then user should see ZeroBank homepage



