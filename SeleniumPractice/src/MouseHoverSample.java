import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carmax.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions myact = new Actions(driver);
		WebElement E1 = driver.findElement(By.linkText("Cars For Sale"));
		E1.click();
		//WebElement E2 = driver.findElement(By.xpath("//*[@id=\"schedule-appraisal-anchor\"]"));
		//myact.moveToElement(E1).build().perform();
		//myact.moveToElement(E1).moveToElement(E2).click().build().perform();
		//driver.findElement(By.linkText("Transfers")).click();
		

	}

}
