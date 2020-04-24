package automationTestCases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		/* Launching IRCTC Website and validating login information using CAPTCHA  */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.irctc.co.in/nget/train-search");
		
/* Captcha code usage */
	     
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Captcha");
	String captcha = scan.nextLine();
	driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
	driver.findElement(By.id("loginbutton")).click();
	
	
 
	}

}
