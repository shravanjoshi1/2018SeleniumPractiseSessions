import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Capture browser title
		System.out.println(driver.getTitle());
		
		//Capture current Url
		System.out.println(driver.getCurrentUrl());

		//Count Forms
		System.out.println(driver.findElements(By.xpath("//form")).size());
		
		// Count Frames
		System.out.println(driver.findElements(By.xpath("//frames")).size());
		
		// Count iFrames
		System.out.println(driver.findElements(By.xpath("//iframes")).size());
		
		// Count div count
		System.out.println(driver.findElements(By.xpath("//div")).size());
		
		//Span Count
		System.out.println(driver.findElements(By.xpath("//span")).size());
		
		//Table Count
		System.out.println(driver.findElements(By.xpath("//table")).size());
		
		//Row Count
		System.out.println(driver.findElements(By.xpath("//tr")).size());
		
		//Column Count
		System.out.println(driver.findElements(By.xpath("//td")).size());
	}
	

}


