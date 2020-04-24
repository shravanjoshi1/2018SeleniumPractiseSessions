import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		//Working with Multiple Tabs
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Instagram")).click();
	
	// Tab count
	ArrayList<String> Mytabs = new ArrayList<>(driver.getWindowHandles());
	System.out.println(Mytabs.size());
	
	//Capture Browser Title
	
	for(int i=0; i< Mytabs.size();i++) {
		//Switch to tabs
		driver.switchTo().window(Mytabs.get(i));
		System.out.println(driver.getTitle());
		
		// Switch to facebook link and enter data
		
		if(((driver.getTitle()).equalsIgnoreCase("Instagram"))==true)
		{
		  driver.findElement(By.name("emailOrPhone")).sendKeys("abc123@gmail.com");
	
		  Thread.sleep(10000);
		//  driver.close();
		  driver.switchTo().window(Mytabs.get(0));
		  driver.findElement(By.name("firstname")).sendKeys("shravan");
		  
		  
	}
	}
	

	}

}
