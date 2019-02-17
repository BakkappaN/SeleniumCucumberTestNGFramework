@DataTables
Feature: Youtube channel name validation
Scenario: Youtube channel name validations
	Given Open Chrome browser with URL
	When Search selenium tutorial 
	|bakkappa n selenium webdriver| 
	|bakkappa n selenium |
	|selenium tutorial for beginner by bakkappa n|
	And Click on channel name
	Then Validate channel name
