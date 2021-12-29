Feature: This feature file we will us to reduce the number of steps
	Background:
		Given I nevigate to OSA home Page
	@about 	@regression @title
 	Scenario: I should be able to login in osa with valid credential
 			When I take the title of the home page
 			Then I verify the home page title "OSA Consulting Tech Corp || Best Available Resources For Software Industry"
 			
	@forumPage 	@regression @title
 	Scenario: I should be able to login in osa with valid credential
 			And I click on forum button to go to forum page
 			When I take the title of the home page
 			Then I verify the home page title "OSA Consulting Tech - All the projects."