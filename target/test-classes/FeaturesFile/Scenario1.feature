
Feature: To validate the login functionality.

Background:
		Given To user launch Chrome browser.
		
  Scenario: To validate valid username and invalid password.
    
    Given To user pass valid url.
    When To user enter valid username and invalid password.
    And To user click login button.
    Then To user verify valid.
   
	Scenario: To validate invalid username and invalid password.
   
    Given To user enter valid url.
    When To user enter invalid username and invalid password.
    And To user click login button.
    Then To user to close the chrome browser.	
 
   
