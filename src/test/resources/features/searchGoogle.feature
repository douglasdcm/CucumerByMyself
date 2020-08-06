Feature: Performe a search on Google
	In order to validate the Google search
	As a user
	I seach something on home page
	
Scenario:
	Given I am on Google Home page "https://www.google.com"
	When I seach for "cheese"
	Then I see a list of results
	And the first item has "cheese" in the title