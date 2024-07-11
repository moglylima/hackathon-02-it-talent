Feature: Login functionality

  Scenario: Login with empty password
    Given the user is on the login page "https://homero.app.br/login"
    When the user enters username "testuser@gmail.com"
    And the user leaves the password field blank
    And the user clicks the login button
    Then an error message "Esse campo é obrigatório" should be displayed
