Feature: OSA user should be able to login in osa forum
  @login @smoke @regression 
  Scenario Outline: I should not be able to login by using my invalid crednetials 
    Given I am on osa forum page
    And I enter valid username <username>
    And I enter valid password <password>
    When I click on login button
    Then I verify that I am able to loggin
    And I close the browser
    Examples:
    |  username   |password |
    |"user1"      |"pass1"  |
  	|"user2" 			|"pass2"  |
  	|"user3"			|"pass3"  |
  	
  	
