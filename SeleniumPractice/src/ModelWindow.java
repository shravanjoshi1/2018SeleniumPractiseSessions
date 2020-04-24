import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelWindow {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");

		driver.manage().window().maximize();

		// Identifying the People Link

		driver.findElement(By.linkText("People")).click();

		Thread.sleep(5000);

		// Capture Model window name

		String Mname = driver.getWindowHandle();
		System.out.println(Mname);

		// Switch to Model Window

		driver.switchTo().window(Mname);

		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abc1234");
		driver.findElement(By.id("loginbutton")).click();
		driver.switchTo().defaultContent();
		// TODO Auto-generated method stub

	}

}
