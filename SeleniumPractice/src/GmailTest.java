import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class GmailTest {

	public static void main(String[] args) {
		
	try {
		// Set Browser Path
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
			
			//Set Browser Instance
			
			WebDriver Gmail = new ChromeDriver();
			
			//Open test application
			Gmail.get("http://www.gmail.com");
			
			Thread.sleep(2000);
			
			//Maximize the window
			Gmail.manage().window().maximize();
			
			Thread.sleep(2000);
			
			//Click on create account
			WebElement Create_Account= Gmail.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/content/span"));
			Create_Account.click();
							
			//Identify the first name
			WebElement fname = Gmail.findElement(By.name("firstName"));
			
			//Enter first name
			fname.sendKeys("Shruti");
						
			//Identify the last name
			WebElement lname = Gmail.findElement(By.name("lastName"));
			
			//Enter Last name
			lname.sendKeys("Vyawahare");
			
			//Capture data from edit box
			String myname = lname.getAttribute("value");
			System.out.println(myname);
			
			//Identify the Username
			WebElement Uname = Gmail.findElement(By.name("Username"));
			Uname.sendKeys("shruti1509@gmail.com");
			
			
			
			
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		
		
		
		
		
	

	}

}
