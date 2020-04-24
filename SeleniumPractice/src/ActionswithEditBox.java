import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionswithEditBox {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	WebElement Fname =	driver.findElement(By.name("firstname"));
	
	Actions Myact = new Actions(driver);
//	Myact.sendKeys(Fname,"Shruti");	
	
	Myact.moveToElement(Fname)
	.click()
	.sendKeys("gffrf")
	.keyUp(Keys.SHIFT)
	.keyDown(Keys.SHIFT)
	.doubleClick()
	.build().perform();
	
	Thread.sleep(2000);
	driver.close();	

	}

}
