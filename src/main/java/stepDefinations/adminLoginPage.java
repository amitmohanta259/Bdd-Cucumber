package stepDefinations;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminLoginPage {
	@Given("user should be in the login page")
	public void user_should_be_in_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("user should be in the login page");
	}
	@When("^user enter the (.+) and (.+)$")
	public void user_enter_the_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("user should be in the login page with"+username+" "+password);
	    
	}

	@Then("user should be navigated to the dashboard page")
	public void user_should_be_navigated_to_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("user should be in the login page");
	    
	}
	
	@Given("user should be in the Signup page")
	public void user_should_be_in_the_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user should be in the Signup page");
	}

	@When("user should provide the details for signup")
	public void user_should_provide_the_details_for_signup(List<String> data) {
	    for(String newData : data) {
	    	System.out.println("-"+newData);
	    }
	   
	}

	@Then("user should navigate to login page")
	public void user_should_navigate_to_login_page() {
	    
	}
	
}
