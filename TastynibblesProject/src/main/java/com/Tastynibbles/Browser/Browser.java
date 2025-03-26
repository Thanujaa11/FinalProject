package com.Tastynibbles.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	
	public static void init(String reportName) {
		extent=new ExtentReports();
		reporter=new ExtentSparkReporter(System.getProperty("user.dir") + "//target//ExtentReports//"+reportName+".html");
	}
	public static void openBrowser() throws Exception {
		init("Thanuja");
		try {
			extent.attachReporter(reporter);
			logger1=extent.createTest("Open Browser");
			logger1.log(Status.INFO, "Opening browser");
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
			else if (choice.equalsIgnoreCase("Firefox"))
				driver = new FirefoxDriver();
			logger1.log(Status.PASS, "Crome openend successfully");
		} catch (Exception e) {
			System.out.println("Browser - openBrowser");
			logger1.log(Status.FAIL, "Failed opening browser");
		}
		extent.flush();
	}
	public static void navigateToUrl(String str) throws Exception {
		try {
			extent.attachReporter(reporter);
			logger1=extent.createTest("opening url");
			logger1.log(Status.INFO, "Navigating to url");
			driver.manage().window().maximize();
			driver.get(str); 
			logger1.log(Status.PASS, "navigated to url successfully");
		} catch (Exception e) {
			System.out.println("Browser - geturl");
			logger1.log(Status.FAIL, "Failed in navigating to url");
		}
		extent.flush();
	}
	public static void closeBrowser() {
		try {
			extent.attachReporter(reporter);
			logger1=extent.createTest("Closing Browser");
			logger1.log(Status.INFO, "Closing Browser");
			driver.quit();
			logger1.log(Status.PASS, "Crome closed successfully");
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");
			logger1.log(Status.FAIL, "Failed closing browser");
		}
		extent.flush();

}
}