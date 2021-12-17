
Feature: Only registered students should be able to login in osa Forum

  Scenario: Registered students with valid username and password should be able to login into forum 
    Given I am on osa forum page
    And I enter valid username "mitul.li@gmail.com"
    And I enter valid password "MyPassword"
    When I click on login button
    Then I verify that I am able to loggin
    And I close the browser
    
  Scenario: As a registered user, I should not be able to login by using invalid username and valid password 
    Given I am on osa forum page
    And I enter valid username "invalidusername@gmail.com"
    And I enter valid password "myValidPassword"
    When I click on login button
    Then I verify that I am able to loggin
    And I close the browser
  
  Scenario: As a registered user, I should not be able to login by using valid username and invalid password 
    Given I am on osa forum page
    And I enter valid username "validusername@gmail.com"
    And I enter valid password "inValidPassword"
    When I click on login button
    Then I verify that I am able to loggin
    And I close the browser