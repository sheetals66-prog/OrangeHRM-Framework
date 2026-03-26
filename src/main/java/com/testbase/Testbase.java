package com.testbase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testbase {
	
	String appurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@BeforeMethod
	public void setUp() {
		
		Keyword.openBrowser("chrome");
		Keyword.getUrl(appurl);
		System.out.println("url is launched....");
		Keyword.maximizeWindow();

	}

	@AfterMethod
	public void teardown() {
		Keyword.closeWindow();
		System.out.println("Driver is quite successfully....");
	}
}
