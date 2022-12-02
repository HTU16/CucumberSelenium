Feature: Krafttech Log in Test
  # Agile story : As a user, I should be able to log in so I can see my account

  Scenario: Login as Mike
    Given The user is on the login page
    When The user enters Mike credentials
    Then The user should be able to login

  Scenario: Login as Aegon Targaryen
    Given The user is on the login page
    When The user enters Aegon Targaryen credentials
    Then The user should be able to login
