package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("user is present on the login page")
	public void userIsPresentOnTheLoginPage() {
		
	}

	@When("user enters valid username and password")
	public void userEntersValidUsernameAndPassword() {
		System.out.print("Inside when block");
	}

	@Then("user should navigate to the dashboard")
	public void userShouldNavigateToTheDashboard() {
		System.out.print("Inside then block");
	}

}
