package com.Tastynibbles.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Tastynibbles.Browser.Browser;

public class CreateAcntObj extends Browser {
    
	public static By createAccountLink = By.linkText("Create account");
    public static By firstName = By.xpath("//input[@name='customer[first_name]']");
    public static By lastName = By.xpath("//input[@name='customer[last_name]']");
    public static By email = By.xpath("//input[@name='customer[email]']");
    public static By password = By.xpath("//input[@name='customer[password]']");
    public static By createButton = By.xpath("//input[@class='btn btn--full']");
    public static By logoutElement=By.linkText("Log out");
    public static By errorDiv = By.xpath("//div[@class='errors']");
    
    public static WebElement createAccountObj() {
        return driver.findElement(createAccountLink);    
    }
    
    public static WebElement firstNameMethod() {
        return driver.findElement(firstName);
    }
    
    public static WebElement lastNameMethod() {
        return driver.findElement(lastName);
    }
    
    public static WebElement enterEmailMethod() {
        return driver.findElement(email);
    }
    
    public static WebElement enterPassword() {
        return driver.findElement(password);
    }
    
    public static WebElement createButton() {
        return driver.findElement(createButton);
    }
    
    public static WebElement assertText() {
        return driver.findElement(logoutElement);
    }
    
    public static WebElement errorDiv() {
        return driver.findElement(errorDiv);
    }
}
