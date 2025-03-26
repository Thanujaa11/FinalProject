package com.Tastynibbles.Pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v131.page.model.Screenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.Tastynibbles.Browser.Browser;
import com.Tastynibbles.Locators.CreateAcntObj;
import com.Tastynibbles.Locators.HomePageObjs;
import com.aventstack.extentreports.Status;
import com.Tasynibbles.ScreenShot.*;

public class CreateAcnt extends Browser {
//for clicking on create link
    public static void clickCreateAccountButton() {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("click on createaccount");
			logger1.log(Status.INFO, "Clicked on Create account button");
            CreateAcntObj.createAccountObj().click();
            logger1.log(Status.PASS, "CLicked on Create account successfully");
        } catch (Exception e) {
            System.out.println("Exception in clickOnCreateAccount: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed CLicking on Create account");
        }
        extent.flush();
    }
//Enter the first name in create link
    public static void enterFirstNameDetail(String firstName) {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Enter First Name");
			logger1.log(Status.INFO, "Entering first Name");
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(CreateAcntObj.firstName));
            CreateAcntObj.firstNameMethod().sendKeys(firstName);
            logger1.log(Status.PASS, "Entered First Name successfully");
        } catch (Exception e) {
            System.out.println("Exception in enterFirstName: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed to enter the first name");
        }
        extent.flush();
    }
//enter the last name
    public static void enterLastNameDetail(String lastName) {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Enter the last name");
			logger1.log(Status.INFO, "Entering the last name");
            CreateAcntObj.lastNameMethod().sendKeys(lastName);
            logger1.log(Status.PASS, "Entered Last Name Successfully");
        } catch (Exception e) {
            System.out.println("Exception in enterLastName: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed to enter the last name");
        }
        extent.flush();
    }

    public static void enterEmailDetail(String email) {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Enter Email");
			logger1.log(Status.INFO, "Entering Email ID");
            CreateAcntObj.enterEmailMethod().sendKeys(email);
            logger1.log(Status.PASS, "Entered MailId successfully");
        } catch (Exception e) {
            System.out.println("Exception in enterEmail: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed in Entering the MailId");
        }
        extent.flush();
    }

    public static void enterPasswordDetail(String password) {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Enter the password");
			logger1.log(Status.INFO, "Entering the password");
            CreateAcntObj.enterPassword().sendKeys(password);
            logger1.log(Status.PASS, "Successfully entered Password");
        } catch (Exception e) {
            System.out.println("Exception in enterPassword: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed in entering password");
        }
        extent.flush();
    }

    public static void clickonCreateButton() {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("Click on Create button");
			logger1.log(Status.INFO, "Clicking on create button");
            CreateAcntObj.createButton().click();
            logger1.log(Status.PASS, "click on the successfully");
        } catch (Exception e) {
            System.out.println("Exception in clickCreate: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed clicking on create button");
        }
        extent.flush();
    }

    public static void verifytheErrorMsg() {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("checking error message");
			logger1.log(Status.INFO, "Verify error msg presence");
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement errorDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(CreateAcntObj.errorDiv));
            Assert.assertTrue(errorDiv.isDisplayed());
            logger1.log(Status.PASS, "verified error msg successfully");
        } catch (Exception e) {
            System.out.println("Exception in verifyErrorMsg: " + e.getMessage());
            logger1.log(Status.FAIL, "Failed to verify the error msg");
        }
        extent.flush();
    }

    public static void verifytheSuccessfullRegMsg() throws Exception {
        try {
        	extent.attachReporter(reporter);
			logger1=extent.createTest("verify suucessfulreg msg");
			logger1.log(Status.INFO, "verify suucessfulreg msg");
            HomePageObjs.clickonAccountLink().click();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(CreateAcntObj.logoutElement));
            Assert.assertEquals(CreateAcntObj.assertText().getText(), "Log out");
            logger1.log(Status.PASS, "verified successfully");
        } catch (Exception e) {
            System.out.println("Exception in verifySuccessfullRegistrationMsg: " + e.getMessage());
            Assert.fail();
            logger1.log(Status.FAIL, "Failed to verify the msg");
        }
        extent.flush();
        //Capture.screenShot("Successful registration");
    }

    public static void closeBrowser() {
        try {
        	Browser.closeBrowser();
        } catch (Exception e) {
            System.out.println("Exception in closeBrowser: " + e.getMessage());
        }
    }
}
