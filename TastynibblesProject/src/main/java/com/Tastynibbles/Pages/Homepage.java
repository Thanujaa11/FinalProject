package com.Tastynibbles.Pages;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Tastynibbles.Browser.Browser;
import com.Tastynibbles.Locators.HomePageObjs;
import com.Tasynibbles.ScreenShot.Capture;
import com.aventstack.extentreports.Status;

//for closing the pop up button and click on the account link
public class Homepage extends Browser {
	public static void clickOnAccountLink() throws Exception {
		try {
			extent.attachReporter(reporter);
			logger1=extent.createTest("click on account link");
			logger1.log(Status.INFO, "clicking on account link");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(HomePageObjs.closeButton));
			HomePageObjs.closeButton().click();
			HomePageObjs.clickonAccountLink().click();
			logger1.log(Status.PASS, "Successfully clicked on account link");
		}catch(Exception e) {
			System.out.println("Error in clickOnAccount "+e.getMessage());
			logger1.log(Status.FAIL, "Failed clicking on account linkr");
		}
		extent.flush();
        Capture.screenShot("HomePage");
	}
}
