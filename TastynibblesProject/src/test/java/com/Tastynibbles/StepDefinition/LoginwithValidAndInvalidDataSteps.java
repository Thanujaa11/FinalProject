package com.Tastynibbles.StepDefinition;

import com.Tastynibbles.Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginwithValidAndInvalidDataSteps {
	@When("User enters the {string} invalid email")
	public void user_enters_the_invalid_email(String string) {
	    LoginPage.enterEmail(string);
	}

	@When("User enters the {string} password")
	public void user_enters_the_password(String string) {
	    LoginPage.enterPassword(string);
	}

	@And("User verifies the {string} error message")
	public void user_verifies_the_error_message(String string) throws Exception {
	   LoginPage.verifyErrorMsg(string);
	}


	@And("User verifies {string} is displayed or not")
	public void user_verifies_is_displayed_or_not(String string) {
	    LoginPage.verifySuccessfulLogin(string);
	}
}
