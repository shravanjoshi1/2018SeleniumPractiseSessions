import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {

try {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\Desktop\\\\SeleniumSoftwares\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	//Using Frames, switch to 3rd Frame
	
	driver.switchTo().frame(2);
	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	
	Thread.sleep(2000);
	driver.navigate().back();
	
	//Switch from 3rd Frame to Top Window
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	
	//Switch to 1st Frame
	
	driver.switchTo().frame(0);
	driver.findElement(By.linkText("org.openqa.selenium")).click();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
