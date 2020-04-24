import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DuplicateElements {

	public static void main(String[] args) {
		
		//Set Browser Path
		System.setProperty("webdriver.ie.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\IEDriverServer.exe");
		//Create Browser Instance
		WebDriver driver = new InternetExplorerDriver();
		
		//Open Test Url
		
		driver.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"new-account-btn\"]")).click();
		
		//Switch to Frame on Right
		
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("//*form[@id=\"password\"]")).sendKeys("abc13");
		driver.findElement(By.xpath("//form[@id='registration-form']/div/div/input[@id='password']")).sendKeys("abc123");
		
		

	}

}
