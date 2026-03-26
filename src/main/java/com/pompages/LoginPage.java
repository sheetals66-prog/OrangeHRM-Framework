package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fileutils.WaitFor;
import com.testbase.Keyword;

public class LoginPage {

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement userNameTxBx;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement passwordTxBx;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginBtn;
	
	@FindBy(css = "p.oxd-alert-content-text")
	

	WebElement errorMessage;

	
		{
		PageFactory.initElements(Keyword.driver, this);
	}

	public void enterUserName(String username) {
		WaitFor.waitForElementToBeVisible(userNameTxBx);
		userNameTxBx.sendKeys(username);
	}

	private void waitForElementToBeVisible(WebElement userNameTxBx2) {
		// TODO Auto-generated method stub
		
	}

	public void clearUsername() {
		userNameTxBx.clear();
	}

	public void enterPassword(String password) {
		passwordTxBx.sendKeys(password);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
    public    String getErrormessage() {
	return WaitFor.elementToBevisible(errorMessage).getText();
    	
    }
}
