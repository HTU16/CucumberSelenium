@login
Feature: Krafttech Log in Test
  # Agile story : As a user, I should be able to log in so I can see my account

  @Mike
  Scenario: Login as Mike
    Given The user is on the login page
    When The user enters Mike credentials
    Then The user should be able to login

    @GOT @smoke
  Scenario: Login as Aegon Targaryen
    Given The user is on the login page
    When The user enters Aegon Targaryen credentials
    Then The user should be able to login

      @GOT  @smoke
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa credentials
    Then The user should be able to login

  Scenario: User should be abe to login with valid credentials
    Given User should be on the login page
    When User should input login information
    Then User should be on home page

  @wip
  Scenario: Login with parameters
    Given User should be on the login page
    When User should input "user22@test.com" and "Test123456"
    Then User should be on home page
