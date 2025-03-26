package com.Tastynibbles.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Tastynibbles.Browser.Browser;
//for closing the pop up button and click on the account link
public class HomePageObjs extends Browser {
    public static By closeButton = By.xpath("//span[@class='engt_modal_close-btn']");
    public static By accountLinkHome = By.linkText("ACCOUNT");
    public static WebElement closeButton() {
        return driver.findElement(closeButton);
    }
    public static WebElement clickonAccountLink() {
        return driver.findElement(accountLinkHome);
    }
}