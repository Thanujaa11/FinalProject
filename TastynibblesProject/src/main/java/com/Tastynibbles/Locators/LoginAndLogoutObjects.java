package com.Tastynibbles.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Tastynibbles.Browser.Browser;

public class LoginAndLogoutObjects extends Browser {
		public static By logoutButton = By.linkText("Log out");
	    public static By accountLink = By.linkText("ACCOUNT");
	    public static By vefiryDiv=By.xpath("//div[@class=\"hero__animation-contents\"]");
	    public static WebElement accountLink() {
	        return driver.findElement(accountLink);
	    }
		public static WebElement logout() {
			return driver.findElement(logoutButton);
		}
		public static String homePageUrl() {
			return driver.getCurrentUrl();
		}
}
