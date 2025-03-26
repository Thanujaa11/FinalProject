package com.Tastynibbles.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Tastynibbles.Browser.Browser;

public class LoginPageObjects extends Browser{
		public static By email=By.xpath("//input[@name=\"customer[email]\"]");
		public static By password =By.xpath("//input[@name=\"customer[password]\"]");
		public static By signInButoon=By.xpath("//button[@class=\"btn btn--full\"]");
		public static By errorMsg=By.xpath("//div[@class=\"errors\"]/ul/li");
		public static By myAccountElement=By.xpath("//h1[@class=\"section-header__title\"]");
		
		public static WebElement email() {
			return driver.findElement(email);
		}
		public static WebElement password() {
			return driver.findElement(password);
		}
		public static WebElement signInButton() {
			return driver.findElement(signInButoon);
		}
		public static WebElement error() {
			return driver.findElement(errorMsg);
		}
		public static WebElement myAccount() {
			return driver.findElement(myAccountElement);
		}
}