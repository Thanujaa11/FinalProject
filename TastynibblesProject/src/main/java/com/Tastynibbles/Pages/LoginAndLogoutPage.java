package com.Tastynibbles.Pages;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Tastynibbles.Browser.Browser;
import com.Tastynibbles.Locators.LoginAndLogoutObjects;
import com.aventstack.extentreports.Status;

public class LoginAndLogoutPage extends Browser {

    public static void logoutFromApp() {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Logout");
			logger1.log(Status.INFO, "Logging out from application");
            LoginAndLogoutObjects.logout().click();
            logger1.log(Status.PASS, "logout successfully");
        } catch (Exception e) {
            System.out.println("Error while clicking logout: " +e.getMessage());
            logger1.log(Status.FAIL, "Failed to logout");
        }
        extent.flush();
    }
    public static void verifyLogout(String url) {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Verify logout");
			logger1.log(Status.INFO, "verifying logout");
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(LoginAndLogoutObjects.vefiryDiv));
            Assert.assertEquals(LoginAndLogoutObjects.homePageUrl(), url);
            logger1.log(Status.PASS, "verified logout successfully");
        } catch (Exception e) {
            System.out.println("Error while verifying logout: " +e.getMessage());
            logger1.log(Status.FAIL, "Failed to verify the logout");
        }
        extent.flush();
    }
}
