package com.Tastynibbles.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.Tastynibbles.Browser.Browser;
import com.Tastynibbles.Pages.CreateAcnt;
import com.Tastynibbles.Pages.Homepage;
public class Registration {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
	    Browser.openBrowser();
	}
	@And("User navigate to the {string} web page")
	public void user_navigate_to_the_web_page(String string) throws Exception {
	   Browser.navigateToUrl(string);
	}

	@When("User clicks on Account link")
	public void user_clicks_on_account_link() throws Exception {
	    Homepage.clickOnAccountLink();
	}
	@When("user clicks on Create account link")
	public void user_clicks_on_create_account_link() {
	   CreateAcnt.clickCreateAccountButton();
	}

	@When("User enters {string} in FirstName")
	public void user_enters_in_first_name(String string) {
	   CreateAcnt.enterFirstNameDetail(string);
	}

	@And("User enters  {string} in LastName")
	public void user_enters_in_last_name(String string) {
		   CreateAcnt.enterLastNameDetail(string);
	}

	@And("User enters {string} in email")
	public void user_enters_in_email(String string) {
		   CreateAcnt.enterEmailDetail(string);
	}

	@And("User enters  {string} in password")
	public void user_enters_in_password(String string) {
		   CreateAcnt.enterPasswordDetail(string);
	}

	@And("User clicks on Create button")
	public void user_clicks_on_create_button() {
	    CreateAcnt.clickonCreateButton();
	}

	@Then("User verifies the error message")
	public void user_verifies_the_error_message() {
	   CreateAcnt.verifytheErrorMsg();
	}

	@Then("User verifies  registered successfully")
	public void user_verifies_registered_successfully() throws Exception {
	   CreateAcnt.verifytheSuccessfullRegMsg();
	}
	
	@And("User closes the Browser")
	public void user_closes_the_browser() {
		 CreateAcnt.closeBrowser();
	}
}
