
Feature: To validate the login functionality.

Background:
		Given To user launch Chrome browser.
		
  Scenario: To validate valid username and invalid password.
    
    Given To user pass valid url.
    When To user passed valid username and invalid password.
    				|red|111|blue|sql@123|
    And To user click login button.
    Then To user verify valid.
   
	Scenario: To validate invalid username and invalid password.
   
    Given To user enter valid url.
    When To user passed invalid username and invalid password.
    			|java|1111|
    			|python|2222|
    			|sql|3333|
    And To user click login button.
    Then To user to close the chrome browser.	
 