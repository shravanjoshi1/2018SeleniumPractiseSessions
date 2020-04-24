import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {
	
	WebDriver driver;
	
	public void InvokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		     getCommands();  
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
	}
	
	public void getCommands() {
		try {
			driver.get("https://www.amazon.co.in");
			String titleofThePage = driver.getTitle();
			System.out.println("The Title of the page is " + titleofThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The current URL is" + currentUrl);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

		
	
	public static void main(String[] args) {
		TestGetCommands myObj = new TestGetCommands();
		myObj.InvokeBrowser();

	}

}
