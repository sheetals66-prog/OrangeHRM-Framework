package com.fileutils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testbase.Keyword;

public class WaitFor {
	static WebDriverWait wait;
	static {
		wait = new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(NoSuchElementException.class);
	}

	public static void elementToBevisible(By username) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(username));
	}

	public static void waitForElementToBeVisible(WebElement userNameTxBx2) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOf(userNameTxBx2));
	}

	public static WebElement elementToBevisible(WebElement errorMessage) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOfAllElements(errorMessage));
		return errorMessage;
	}
	
}
