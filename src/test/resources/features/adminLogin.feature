Feature: Verify the Login Page
	#First way to provider data provider
	@SmokeTest
	Scenario: Verify the Login page valid input
		Given user should be in the login page
		When user enter the <username> and <password>
		Then user should be navigated to the dashboard page
		
	Examples:
		|username | password|
		|restore  |Test@123 |
		|amit	  |Pass@123	|	
		
	@SmokeTest @Regression
	Scenario: Verify the Login page valid input
		Given user should be in the login page
		When user enter the <username> and <password>
		Then user should be navigated to the dashboard page
		
	Examples:
		|username | password|
		|restore1  |Test@123 |
		|amit1	  |Pass@123	|		
		
	#second way to provider data provider 
	@Regression
	Scenario: Verify the Signup Page
		Given user should be in the Signup page
		When user should provide the details for signup
		|Amit|
		|Mohanta|
		|amitmohanta@gmail.com|
		|1234567890|
		|Student|
		|Male|
		|Test@123|
		|Test@123|
		|18|
		Then user should navigate to login page


		