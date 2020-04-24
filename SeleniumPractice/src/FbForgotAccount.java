import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class FbForgotAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//Set Browser Path	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		
	//Create Browser instance
		WebDriver fbapp =new ChromeDriver();
		
	//Open Application
		fbapp.get("http://www.facebook.com");
		
	//Maximize the Window
		fbapp.manage().window().maximize();
		
	//	Click on Forgot Account
		
		WebElement Forgot_Account= fbapp.findElement(By.linkText("Forgotten account?"));
		Forgot_Account.click();
	
	//Finding Account
		
		WebElement Find_Account =fbapp.findElement(By.id("identify_email"));
	
	// Enter Email Details
		Find_Account.sendKeys("shravanjoshi1@gmail.com");
		
	// Validating the Search Button
		
		WebElement Submit = fbapp.findElement(By.xpath("//input[@value='Search']"));
		
		Submit.click();
		
		Thread.sleep(2000);
		
		fbapp.navigate().back();
		

	}

}
