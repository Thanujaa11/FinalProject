package com.Tastynibbles.Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Tastynibbles.Browser.Browser;
public class MultipleItemsToCartObjs extends Browser {
		public static By price=By.xpath("//span[@class=\"cart__price\"]/span");
		public static By totalPrice=By.xpath("//span[@class=\"csapps-cart-original-total\"]/div");
		
		
		public static  List<WebElement> prices() {
	        List<WebElement> list = driver.findElements(By.xpath("//span[@class=\"cart__price\"]"));
	        return list;
		}
		public static WebElement price() {
			return driver.findElement(price);
		}
		public static WebElement totalPrice() {
			return driver.findElement(totalPrice);
		}
}

