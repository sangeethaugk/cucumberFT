Feature: To validate the login functionality.

Background:
		Given To user launch Chrome browser.
		
  Scenario: To validate valid username and invalid password.
    
    Given To user pass valid url.
    When To user pass valid username and invalid password.
    		#1D MAP
    		|username1|sql@123|
    		|password1|1111|
    		|email|java@gmail.com|
    		|phoneno|790435|		
    And To user click login button.
    Then To user verify valid.
   
	Scenario: To validate invalid username and invalid password.
   
    Given To user enter valid url.
    When To user pass invalid username and invalid password.
    		#2D MAP
    		|email|phoneno|password|
    		|java@gmail|1111|java|
    		|sql@gmail|2222|sql|
    		|selenium|3333|selenium|
    And To user click login button.
    Then To user to close the chrome browser.	
 