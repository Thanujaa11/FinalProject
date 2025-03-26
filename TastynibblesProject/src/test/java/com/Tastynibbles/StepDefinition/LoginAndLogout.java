package com.Tastynibbles.StepDefinition;


import com.Tastynibbles.Pages.LoginAndLogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginAndLogout {
	@And("User selects Logout option")
	public void user_selects_logout_option() {
	    LoginAndLogoutPage.logoutFromApp();
	}

	@Then("User Verify that the session ends and the user is redirected to the {string} homepage.")
	public void user_verify_that_the_session_ends_and_the_user_is_redirected_to_the_homepage(String string) {
	   LoginAndLogoutPage.verifyLogout(string);
	}
	
}
