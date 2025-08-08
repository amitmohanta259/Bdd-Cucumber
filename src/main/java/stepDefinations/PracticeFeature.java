package stepDefinations;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StringManupulation;

public class PracticeFeature {
	String result;
	String input;
	String actual;
	StringManupulation obj1;
	@Given("a string {string}")
	public void stringReverse(String str) {
		input = str;
	}
	
	// reversing a string
	@When("i reverse it")
	public void iReverseIt() {
		obj1 = new StringManupulation();
		actual = obj1.reverseAString(input);
		
	}
	
	@Then("the output is {string}")
	public void theOuputIs(String expected)
	{
		assertEquals(expected, actual);
		System.out.println("Output for reverse");	
		System.out.println(actual);
		System.out.println("-----------------------------");
	}
	
	
	// Removing the vowels
	@When("i remove the vowel")
	public void iRemoveTheVowel() {

		if (obj1 == null) {
            obj1 = new StringManupulation();
        }
	
		//Code for removing the vowel
		actual = obj1.removeVowels(input);
	}
	
	@Then("the output after removing vowel {string}")
	public void theOutputAfterRemovingVowel(String expected) {
		assertEquals(expected, actual);
		System.out.println("Output for reverse");	
		System.out.println(actual);
		System.out.println("-----------------------------");
	}
	
	
	
	
	
	
}
