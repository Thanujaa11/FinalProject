package com.Tastynibbles.Pages;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.Tastynibbles.Browser.Browser;
import com.Tastynibbles.Locators.LoginPageObjects;
import com.Tasynibbles.ScreenShot.Capture;
import com.aventstack.extentreports.Status;
public class LoginPage extends Browser {
    
    public static void enterEmail(String email) {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Enter email for login");
			logger1.log(Status.INFO, "entering email for login");
        	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageObjects.email));
            LoginPageObjects.email().sendKeys(email);
            logger1.log(Status.PASS, "Entered email sucessfully for login");
        } catch (Exception e) {
            System.out.println("Error while entering email: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed entering email for login");
        }
        extent.flush();
    }
    public static void enterPassword(String password) {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Enter password for login");
			logger1.log(Status.INFO, "Entering password for login");
            LoginPageObjects.password().sendKeys(password);
            logger1.log(Status.PASS, "Entered password successfully");
        } catch (Exception e) {
            System.out.println("Error while entering password: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed to enter the password for login");
        }
        extent.flush();
    }
    public static void clickSignIn() throws Exception {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Click on sign in button");
			logger1.log(Status.INFO, "clicking on sign in button");
            LoginPageObjects.signInButton().click();
            logger1.log(Status.PASS, "Sign in button clicked successfully");
        } catch (Exception e) {
            System.out.println("Error while clicking Sign In button: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed to click on sign in button");
        }
        Capture.screenShot("Signin button");
        extent.flush();
    }
    public static void verifyErrorMsg(String msg) throws Exception {
    	try {
    		extent.attachReporter(reporter);
			logger1=extent.createTest("Verify the error mesaage");
			logger1.log(Status.INFO, "Verifying error message");
    		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageObjects.errorMsg));
    		Assert.assertEquals(LoginPageObjects.error().getText(), msg);
    		logger1.log(Status.PASS, "Verified error message successfully");
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		logger1.log(Status.FAIL, "Failed to verify the error message");
    	}
        Capture.screenShot("verifyerrormsg");
    	extent.flush();
    }
    public static void verifySuccessfulLogin(String str) {
    	try {
    		extent.attachReporter(reporter);
			logger1=extent.createTest("Verify login");
			logger1.log(Status.INFO, "verifying login operation");
    		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageObjects.myAccountElement));
    		Assert.assertEquals(LoginPageObjects.myAccount().getText(), str);
    		logger1.log(Status.PASS, "Verified the login successfully");
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		logger1.log(Status.FAIL, "Failed to verify the login operation");
    	}
    	extent.flush();
    }
}