Feature: Title of your feature
  I want to use this template for my feature file

  @dataT
  Scenario: We will pass the value from cucumber dataTable
    Given I am on osa forum page
    And I enter username password
    	|username|password|
    #	|username1|password1|
    When I click on login button
	  Then I verify that I am able to loggin
	  And I close the browser
    
