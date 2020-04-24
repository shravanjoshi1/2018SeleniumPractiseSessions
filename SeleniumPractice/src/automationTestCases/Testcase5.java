package automationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase5 extends CustomMethods {

	// Using the concept of Inheritance
	// Redirect to user interface via admin

	public static void main(String[] args) throws Exception {

		Testcase5 object = new Testcase5();
		object.LaunchBrowser();
		object.adminLogin("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
	//	Thread.sleep(5000);
		WebDriverWait Mywait = new WebDriverWait(driver, 30);
	//	Mywait.until(ExpectedConditions.);
		
		//object.closeBrowser();

	}

}
