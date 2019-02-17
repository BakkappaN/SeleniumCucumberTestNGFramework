@CucumberTags
Feature: Youtube channel name validation

@Module1 @RegressionTesting @SmokeTesting
Scenario: Youtube channel name validations
	Given Open Chrome browser with URL
	When Search selenium tutorial
	And Click on channel name
	Then Validate channel name

@Module1
Scenario: Youtube channel name validations
	Given Open Chrome browser with URL
	When Search selenium tutorial
	And Click on channel name
	Then Validate channel name

@Module1  @RegressionTesting @SmokeTesting
Scenario: Youtube channel name validations
	Given Open Chrome browser with URL
	When Search selenium tutorial
	And Click on channel name
	Then Validate channel name
