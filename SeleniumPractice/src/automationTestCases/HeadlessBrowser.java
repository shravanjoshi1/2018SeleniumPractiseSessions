package automationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// Set the chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");	

		// Create Object of ChromeOption Class
		ChromeOptions option=new ChromeOptions();

		//Set the setHeadless is equal to true which will run test in Headless mode
		option.setHeadless(true);
		System.out.println("App xyz");

		// pass the option object in ChromeDriver constructor
		WebDriver driver=new ChromeDriver(option);

		// Provide any url
		driver.get("http://www.facebook.com/");

		System.out.println("Title is "+driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("xyz");
		System.out.println("firstname entered");

		// Close the instance
		driver.quit();

		}

		

	}

