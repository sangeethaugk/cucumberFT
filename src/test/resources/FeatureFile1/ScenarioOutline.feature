
@login
Feature: To verify the login functionality.
  @smoke
  Scenario Outline: To validate login function valid and invalid datas.
    Given To user launch Chrome browser.
    When To user enter "<username>" and "<password>".
    And To user click login button.
    Then To user verify the valid.
   
    Examples: 
      | username| password	| 
      | java		|  1111	    | 
 #     | python	|  2222	    |
  #    |	sql     |  3333   	|
