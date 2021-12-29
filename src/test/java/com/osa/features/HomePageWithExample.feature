
Feature: Registered user should be able to login in osa forum
   @loginTwo @regression
  Scenario Outline: As a registered user, I should not be able to login by using my invalid crednetials 
	    Given I am on osa forum page
	    And I enter valid username <username>
	    And I enter valid password <password>
	    When I click on login button
	    Then I verify that I am able to loggin
	    And I close the browser
    Examples:
    |         username            |password       |
    |"invalidusername@gmail.com"  |"validPassword"|
  	|"validusername" 						  |"invalidPass"  |
  	|"Invaliduser"							  |"invalidPass"  |
  	
    Scenario Outline: As a registered user, I should be able to login by using my valid crednetials 
	    Given I am on osa forum page
	    And I enter valid username <username>
	    And I enter valid password <password>
	    When I click on login button
	    Then I verify that I am able to loggin
	    And I close the browser
    Examples:
    |         username  |password   |
    |"validuser1"  |"validpassword1"|
    |"validuser2"  |"validpassword2"|
    |"validuser3"  |"validpassword3"|

  	
  	
  	
