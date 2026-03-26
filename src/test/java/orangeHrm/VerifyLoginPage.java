package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v143.page.Page;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fileutils.Locator;
import com.fileutils.WaitFor;
import com.pompages.HomePage;
import com.pompages.LoginPage;

import static com.testbase.Keyword.*;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import com.testbase.Keyword;
import com.testbase.Testbase;

public class VerifyLoginPage extends Testbase {

	@Test
	public void verifyLoginPage() throws InterruptedException {

		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("sheetal");
		driver.findElement(By.name("middleName")).sendKeys("rahul");
		driver.findElement(By.name("lastName")).sendKeys("kamble");

		// Avoid duplicates ID
		Random rand = new Random();
		int randnum = rand.nextInt(1000);
		String empId = "Emp" + randnum;
		// driver.findElement(By.xpath("(//input[@class=\"oxd-input
		// oxd-input--active\"])[2]")).click();
		driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys(empId);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		/*
		 * // Capture Error Message Thread.sleep(5000); String errorMsg =
		 * driver.findElement(By.xpath("//span[text()='Employee Id already exists']")).
		 * getText();
		 * 
		 * System.out.println("Error Message: " + errorMsg);
		 */

		/*
		 * // Verify Error Message if (errorMsg.equals("Employee Id already exists")) {
		 * 
		 * System.out.println("Duplicate Employee ID validation working correctly"); }
		 * else { System.out.println("Validation failed"); }
		 */

		Thread.sleep(5000);

		System.out.println("Employee Added Successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h6[text()='sheetal kamble']")).click();
		// Assert.assertEquals(errorMsg, "Employee Id already exists");
	}

	@Test
	public void verifyLoginPageWithKeyword() throws InterruptedException {

		WaitFor.elementToBevisible(By.xpath(Locator.username));
		enterText("xpath", Locator.username, "Admin");
		enterText("xpath", Locator.password, "admin123");
		clickOnElement("xpath", Locator.click);

	}

	@Test
	public void verifyLoginPageWithPom() throws InterruptedException {

		LoginPage lp = new LoginPage();
		WaitFor.elementToBevisible(By.xpath(Locator.username));
	
		lp.enterUserName("Admin");
		lp.enterPassword("admin123");
		lp.clickLoginBtn();
		HomePage hm = PageFactory.initElements(driver, HomePage.class);
		hm.waitForpimmenu();

	}
}
