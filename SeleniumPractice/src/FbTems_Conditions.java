import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTems_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Browser path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		
		//Create Browser instance
		WebDriver fbapp =new ChromeDriver();
		
	//Open Application
		fbapp.get("http://www.facebook.com");
		
	//Maximize the Window
		fbapp.manage().window().maximize();
		
	//Validating the Terms and conditions 
	WebElement terms = fbapp.findElement(By.linkText("Terms"));	
	terms.click();
	WebElement datapolicy =fbapp.findElement(By.linkText("Data Policy"));
	datapolicy.click();
	WebElement cookiepolicy =fbapp.findElement(By.linkText("Cookie Policy"));
	cookiepolicy.click();
	
		
	}

}
