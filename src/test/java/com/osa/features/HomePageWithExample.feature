
Feature: Registered user should be able to login in osa forum

  #Scenario: as a registerd user, I should be login using my valid credential
    #Given I am on osa forum page
    #And I enter valid username "mitul.li@gmail.com"
    #And I enter valid password "MyPassword"
    #When I click on login button
    #Then I verify that I am able to loggin
    #And I close the browser
    
  Scenario Outline: As a registered user, I should not be able to login by using my invalid crednetials 
    Given I am on osa forum page
    And I enter valid username <username>
    And I enter valid password <password>
    When I click on login button
    Then I verify that I am able to loggin
    And I close the browser
    Examples:
    |         username             |password       |
    |"invalidusername@gmail.com"   |"validPassword"|
  	|"validusername" 							 |"invalidPass"  |
  	|"Invaliduser"								 |"invalidPass"  |
  	
  	
  	
