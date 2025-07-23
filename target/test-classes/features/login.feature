Feature: Verify Login


Scenario: Verify with valid username and password
Given user is present on the login page
When user enters valid username and password
Then user should navigate to the dashboard
		