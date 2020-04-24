package automationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
public static WebDriver driver;
public static boolean existence;

	public static void main(String[] args) throws Exception
 {
		
		/* Test Case Verify Element Existence (Gmail link existence in Google home page
		 * Test Steps
		 * Launch the browser
		 * Navigate to Google.com(Google HomePage)
		 * Verification criteria
		 * Check the existence of GmailLink
		 */
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");	

	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().window().getSize();
	/*if(driver.findElement(By.linkText("Gmail")).isDisplayed()) {
		System.out.println("Gmail Link is been displayed on the HomePage");
	}
	else
	{
		System.out.println("Gmail Link is not displayed on the HomePage");
	}*/
	
 try {
	existence =driver.findElement(By.linkText("Gmail")).isDisplayed();
		if(existence == true)
		{
			System.out.println("Gmail Link is been displayed on the HomePage");
		}
 } catch (NoSuchElementException e)
 {
 
					System.out.println("Gmail Link is not displayed on the HomePage");
 }	
		Thread.sleep(5000);
		driver.close();
 
	

}
}

