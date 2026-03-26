package com.testbase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v143.dom.DOM.GetElementByRelationRelation;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.exceptions.InvalidBrowserNameException;
import com.fileutils.WaitFor;

public class Keyword {
	public static RemoteWebDriver driver;

	public static void openBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("Chrome Browser is launched");
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Firefox browser is launched.");
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.out.println("Edge browser is launched.");
		} else {
			throw new InvalidBrowserNameException();
		}
		System.out.println("Browser is launched successfully..");
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();;

	}

	public static void getUrl(String url) {
		driver.get(url);

	}
	public static void closeWindow() {
		driver.quit();
		
	}

	public static void enterText(String locatorType, String locator, String textbox) {
	

	  
		 
		if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).sendKeys(textbox);
		} else if (locatorType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).sendKeys(textbox);
		} else if (locatorType.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(locator)).sendKeys(textbox);
		} else if (locatorType.equalsIgnoreCase("Tagname")) {
			driver.findElement(By.tagName(locator)).sendKeys(textbox);
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			driver.findElement(By.linkText(locator)).sendKeys(textbox);
		} else if (locatorType.equalsIgnoreCase("PartiallinkText")) {
			driver.findElement(By.partialLinkText(locator)).sendKeys(textbox);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).sendKeys(textbox);
		} else if (locatorType.equalsIgnoreCase("css selector")) {
			driver.findElement(By.cssSelector(locator)).sendKeys(textbox);
		}

	}

	

	public static void clickOnElement(String locatorType, String locator) {
		// TODO Auto-generated method stub
		if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).click();
		} else if (locatorType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).click();
		} else if (locatorType.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(locator)).click();
		} else if (locatorType.equalsIgnoreCase("Tagname")) {
			driver.findElement(By.tagName(locator)).click();
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			driver.findElement(By.linkText(locator)).click();
		} else if (locatorType.equalsIgnoreCase("PartiallinkText")) {
			driver.findElement(By.partialLinkText(locator)).click();
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).click();
		} else if (locatorType.equalsIgnoreCase("css selector")) {
			driver.findElement(By.cssSelector(locator)).click();
		}

	}

}
