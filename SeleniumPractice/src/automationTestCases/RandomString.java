package automationTestCases;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RandomString {

	public static void main() {

		// TODO Auto-generated method stub
		
			
			//Set Browser Path
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
			
			//Create Browser Instance
			
			WebDriver driver = new ChromeDriver();
			
			//Get test Application
			
			driver.get("http://www.facebook.com");
			
			//Maximize the window
			
			driver.manage().window().maximize();
			
			
			//Enter First Name
		String uuid = UUID.randomUUID().toString();
			driver.findElement(By.name("firstname")).sendKeys(uuid);
			driver.close();
	        
		    }
	}


