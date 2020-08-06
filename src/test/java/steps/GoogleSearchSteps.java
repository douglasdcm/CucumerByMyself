package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class GoogleSearchSteps {
	
	@Given("^I am on Google Home page \"([^\"]*)\"$")
	public void i_am_on_Google_Home_page(String url) throws Throwable {
		//create the page and return the driver
		SeleniumDriver.getDriver()
		
	}

	@When("^I seach for \"([^\"]*)\"$")
	public void i_seach_for(String arg1) throws Throwable {
		//creates the webdriver and set the url

	}

	@Then("^I see a list of results$")
	public void i_see_a_list_of_results() throws Throwable {
		
	}

	@Then("^the first item has \"([^\"]*)\" in the title$")
	public void the_first_item_has_in_the_title(String arg1) throws Throwable {
		
	}

	
}
