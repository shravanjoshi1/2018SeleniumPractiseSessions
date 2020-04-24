import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Set Browser path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		
		//Create Browser instance
		WebDriver fbapp =new ChromeDriver();
		
		//Open Test Application
		fbapp.get("http://www.facebook.com");
		Thread.sleep(1000);
		
		//Maximize the window
		fbapp.manage().window().maximize();
		
		//identify the email address
		WebElement email = fbapp.findElement(By.id("email"));
		
		//Enter the email address
		email.sendKeys("Shravanjoshi1@gmail.com");
		
		//Identify password 
		WebElement pswrd = fbapp.findElement(By.name("pass"));
		
		//Enter the email address
		pswrd.sendKeys("abc@123");
		
		//Validate the Login
		WebElement Login = fbapp.findElement(By.xpath("//input[@value='Log In']"));
		//id("loginButton"));
		Login.click();
				
				
		
	}

}

