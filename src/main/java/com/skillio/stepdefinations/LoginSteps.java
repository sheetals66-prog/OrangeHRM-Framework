package com.skillio.stepdefinations;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.pompages.LoginPage;
import com.testbase.Keyword;
import com.testbase.Testbase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
 LoginPage loginPage;
	@Given("I am on the login page")
	public void openBrowserAndLaunchUrl() {

		Keyword.openBrowser("chrome");
		Keyword.getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage = new LoginPage(); // initialize once
	}

	@When("I enter valid username and password and click on login button")
	public void enterValidUsernameAndPassword() throws InterruptedException {
		LoginPage loginPage = new LoginPage();

		loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLoginBtn();
	}

	@Then("I should be logged in successfully")
	public void verifyUserIsAbleToLoginSuccessfully() {
		String expectedTitle = "OrangeHRM";
		String actualTitle = Keyword.driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}
	}

	@When("I enter invalid username and password and click on login button")
	public void enterInvalidUsernameAndPassword() throws InterruptedException {
		LoginPage loginpage = new LoginPage();
		loginpage.enterUserName("admin123");
		loginpage.enterPassword("Admin123");
		loginpage.clickLoginBtn();
	}

	@Then("I should see an error message indicating invalid credentials")
	public void verifyUserIsUnableToLoginSuccessfully() {
		
		String errormsg =loginPage.getErrormessage() ;
		Assert.assertTrue(errormsg.contains("Invalid"));
	}

}