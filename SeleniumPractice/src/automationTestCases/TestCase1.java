package automationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	
	public static WebDriver driver;
	public static String Url;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test Case to validate internal and external link on Selenium Wikepidea page
		/* Steps to execute 
		 * Launch the Browser
		 * Navigate the test application
		 * Click Create  account Link
		 * Capture current URL
		 * Navigate back to test application
		 * Click on selenium HQ org link
		 * Capture the current Url
		 * Navigate Back
		 * Close the browser
		 * Verification Points
		 * Check if the first captured URL is an internal Link
		 * Check if the second captured URL is an external link
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		 driver.findElement(By.linkText("Create account")).click();
		 Url= driver.getCurrentUrl();
		if(Url.contains("wikipedia")) {
			System.out.println("This is an internal Url- Test case Passed");
		}
		else {
			System.out.println("This is an extenal url-Test case Failed");
		}
		 driver.navigate().back();
		 driver.findElement(By.partialLinkText("selenium")).click();
		 Url =driver.getCurrentUrl();
		if(!Url.contains("wikipedia")) {
			System.out.println("This is an external Url- Test case Passed");
		}
		else {
			System.out.println("This is an internal url - Test case failed");
		}
		driver.close();

	}

}
