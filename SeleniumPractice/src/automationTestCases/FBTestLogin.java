package automationTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBTestLogin {

	public static void main(String[] args)
	{
		// Set Browser Path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");	
		
		//Set Browser Instance
		WebDriver driver = new ChromeDriver();
		
		//Get test application 
		driver.get("https://www.facebook.com");
		
		//Ientify username
		
		
				
				
	}

}
