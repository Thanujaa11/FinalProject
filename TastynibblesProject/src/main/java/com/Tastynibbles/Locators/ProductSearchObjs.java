package com.Tastynibbles.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Tastynibbles.Browser.Browser;

public class ProductSearchObjs extends Browser {
	public static By searchBox=By.xpath("//input[@name=\"q\"]");
	public static By resultContainer=By.xpath("//div[@class=\"new-grid search-grid\"]");
	public static By addToCartButton=By.xpath("//button[@name=\"add\"]");
	public static By cartButton =By.xpath("//a[@id=\"HeaderCartTrigger\"]");
	public static By cartDiv=By.xpath("//div[@class=\"cart__items\"]");
	public static By closeCart =By.xpath("//button[@class=\"site-nav__link site-nav__link--icon js-close-header-cart\"]");
	
	public static  List<WebElement> resultItems() {
        List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"new-grid search-grid\"]/div"));
        return list;
	}
	public static  List<WebElement> cartItems() {
        List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"cart__items\"]/div"));
        return list;
	}
	public static WebElement searchElement() {
		return driver.findElement(searchBox);
	}
	public static WebElement addToCart() {
		return driver.findElement(addToCartButton);
	}
	public static WebElement cart() {
		return driver.findElement(cartButton);
	}
	public static WebElement closeCart() {
		return driver.findElement(closeCart);
	}

}
