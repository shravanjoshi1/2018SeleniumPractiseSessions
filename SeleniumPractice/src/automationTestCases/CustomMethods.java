package automationTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomMethods {


public static WebDriver driver;


public void LaunchBrowser() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
	
    driver = new ChromeDriver();	
    driver.manage().window().maximize();
}

	
public void adminLogin() {

//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");

driver.get("http://www.gcrit.com/build3/admin/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.name("username")).sendKeys("admin");	
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();

}

public void adminLogin(String username,String password) {

//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");

driver.get("http://www.gcrit.com/build3/admin/");
driver.findElement(By.name("username")).sendKeys(username);	
driver.findElement(By.name("password")).sendKeys(password);
driver.findElement(By.id("tdb1")).click();

}

public void closeBrowser() {
	if(!driver.toString().contains("null"))
	{
		driver.close();
	}
}

	public static void main(String[] args) throws Exception {
	
	CustomMethods obj = new CustomMethods();
	obj.LaunchBrowser();
	obj.adminLogin();
	Thread.sleep(5000);
	obj.closeBrowser();
	obj.LaunchBrowser();
	obj.adminLogin("admin","admin@123");
	Thread.sleep(5000);
	obj.closeBrowser();

	}

}
