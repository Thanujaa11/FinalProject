package com.Tastynibbles.Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.Tastynibbles.Browser.Browser;
import com.Tastynibbles.CustomizedExceptions.MyException;
import com.Tastynibbles.Locators.MultipleItemsToCartObjs;
import com.Tastynibbles.Locators.ProductSearchObjs;
import com.aventstack.extentreports.Status;
public class MultipleItemsCartSummary extends Browser{	
	public static void navigateToCart() throws MyException {
		driver.navigate().refresh();
		ProductSearchObjs.cart().click();
	}
	public static void verifyPrices() throws MyException {
	    double sum = 0;
	    try {
	    	extent.attachReporter(reporter);
			logger1=extent.createTest("Verify Prices");
			logger1.log(Status.INFO, "Verifying the prices of items");
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductSearchObjs.cartDiv));
	        List<WebElement> list = MultipleItemsToCartObjs.prices();
	        ArrayList<String> prices = new ArrayList<>();
	        for (WebElement element : list) {
	            String[] splitPrices = element.getText().replace("₹", "").trim().split("\\s+"); 
	            for (String price : splitPrices) {
	                prices.add(price);
	            }
	        }
	        for (int i = 1; i < prices.size(); i += 2) {
	            sum += Double.parseDouble(prices.get(i));
	        }
	        System.out.println(sum+"prices");
	        WebElement totalElement = MultipleItemsToCartObjs.totalPrice();
	        String totalText = totalElement.getText().trim();
	        totalText = totalText.replaceAll("[^0-9]", "").trim();
	        if (totalText.length() > 2) {
	            totalText = totalText.substring(0, totalText.length() - 2);
	        }
	        double totalPrice = Double.parseDouble(totalText);
	        Assert.assertEquals(totalPrice, sum);
	        logger1.log(Status.PASS, "Successfully verified the items prices");
	    } catch (Exception e) {
	    	logger1.log(Status.FAIL, "Failed to verify the item prices");
	        throw new MyException("Error in verifying price: " + e.getMessage());
	    }
	    extent.flush();
	}
}
	

