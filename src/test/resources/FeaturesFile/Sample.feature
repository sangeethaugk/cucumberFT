
@tag
Feature: To validate the login functionality.

  @tag1
  Scenario: To validate login using invalid username and invalid password.
    Given user launch the facebook application.
    And To user maximaize browser
    When user enter username and password.
    And user click login button.
    Then user sees the error message for invalid login attempt
   

 