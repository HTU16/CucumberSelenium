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
