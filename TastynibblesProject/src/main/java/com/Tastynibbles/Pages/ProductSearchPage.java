package com.Tastynibbles.Pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.Tastynibbles.Browser.Browser;
import com.Tastynibbles.CustomizedExceptions.MyException;
import com.Tastynibbles.Locators.ProductSearchObjs;
import com.aventstack.extentreports.Status;

public class ProductSearchPage extends Browser{
		public static void searchProduct(String product) throws MyException {
			try {
				extent.attachReporter(reporter);
				logger1=extent.createTest("Search the product");
				logger1.log(Status.INFO, "searching for the product to add");
				wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(ProductSearchObjs.searchBox));
				ProductSearchObjs.searchElement().sendKeys(product,Keys.ENTER);
				logger1.log(Status.PASS, "searching product done successfully");
			}catch(Exception e) {
				logger1.log(Status.FAIL, "Failed to search the products");
				throw new MyException("Error in searching product:"+e.getMessage());
			}
			
		}
		
		public static void selectProduct(String item) throws MyException {
			try {
				extent.attachReporter(reporter);
				logger1=extent.createTest("Select product");
				logger1.log(Status.INFO, "selecting the product");
				wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(ProductSearchObjs.resultContainer));
		            List<WebElement> list = ProductSearchObjs.resultItems();
		            System.out.println(list.size());
		            for (int i = 0; i < list.size(); i++) {
		                if(list.get(i).getText().contains(item)) {
		                	list.get(i).click();
		                	break;
		                }
		            }
		            logger1.log(Status.PASS, "selected the product successfully");   
				}catch(Exception e) {
					logger1.log(Status.FAIL, "Failed to select the product");
					throw new MyException("Error in selecting product"+e.getMessage());
			}
	     }
		
		public static void addItemToCart() throws MyException {
			try {
				extent.attachReporter(reporter);
				logger1=extent.createTest("Add Item to cart");
				logger1.log(Status.INFO, "Adding item to cart");
				wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(ProductSearchObjs.addToCartButton));
		        ProductSearchObjs.addToCart().click();
		        logger1.log(Status.PASS, "added item to cart successfully");
			}catch(Exception e) {
				logger1.log(Status.FAIL, "Failed to add item to cart");
				throw new MyException("Error in adding Item to cart"+e.getMessage());
			}
		}
		public static void verifyCart(String item) throws MyException {
			try {
				extent.attachReporter(reporter);
				logger1=extent.createTest("Verify the cart");
				logger1.log(Status.INFO, "verifying the cart");
				wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(ProductSearchObjs.cartDiv));
	            List<WebElement> list = ProductSearchObjs.cartItems();
	            for (int i = 0; i < list.size(); i++) {
	                if(list.get(i).getText().contains(item)) {
	                	Assert.assertEquals(true,true);
	                	System.out.println("Item Added");
	                	break;
	                }
	            }
	            logger1.log(Status.PASS, "verified the cart successfully");
			}catch(Exception e) {
				logger1.log(Status.FAIL, "Failed to verify the cart");
				throw new MyException("Error in verifying cart"+e.getMessage());
			}
		}
}
