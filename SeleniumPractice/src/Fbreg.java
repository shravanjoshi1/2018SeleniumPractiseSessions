import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbreg 
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		//Define Log4j
		
		Logger mylogs = Logger.getLogger("devpinoyLogger");
		
		//Set browser path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		
		//Create browser instance
		
		WebDriver fbapp = new ChromeDriver();
		mylogs.debug("browser instace create");
		
		// open test application
		
		fbapp.get("http://www.facebook.com");
		//fbapp.navigate().to("http://www.facebook.com");
		
		mylogs.info("application opened");
				
			Thread.sleep(2000);	
			
			//Maximize the window
			
			fbapp.manage().window().maximize();
			
			Thread.sleep(2000);
			
			//identify the first name
			
			//identify the object
			mylogs.debug("identify the first name");
			
			WebElement fname = fbapp.findElement(By.name("firstname"));
			
			
			//Enter the first name
			
			fname.sendKeys("Shravan");
			
			//Capture Data from edit box
			
			String myname = fname.getAttribute("value");
			System.out.println(myname);
			
			// identify the last name
			
			WebElement lname = fbapp.findElement(By.name("lastname"));
			
			//Enter the last name
			lname.sendKeys("Joshi");
			
			// identify the phone number or Email
			
			WebElement email = fbapp.findElement(By.name("reg_email__"));
			
			WebElement email_1 = fbapp.findElement(By.name("reg_email_confirmation__"));
		
			//Enter the phone number
			email.sendKeys("shravanjoshi1@gmail.com");
			email_1.sendKeys("shravanjoshi1@gmail.com");			
			//identify the password
			
			WebElement pswrd = fbapp.findElement(By.name("reg_passwd__"));
			
			//Enter password
			pswrd.sendKeys("abc@123");
			
			// identify the Birthday
			
			WebElement Birth_Day = fbapp.findElement(By.name("birthday_day"));
			WebElement Birth_Month = fbapp.findElement(By.name("birthday_month"));
			WebElement Birth_Year = fbapp.findElement(By.name("birthday_year"));
			
			//web element convert to select catagory 
			Select Mymonth= new Select(Birth_Month);
			Select MyDay = new Select(Birth_Day);
			Select MyYear = new Select(Birth_Year);
			
			
			//select Date, Month and Year
			Mymonth.selectByVisibleText("May");
			MyDay.selectByVisibleText("15");
			MyYear.selectByVisibleText("1985");
			
			Thread.sleep(5000);
			Mymonth.selectByValue("10");
			MyDay.selectByValue("25");
			MyYear.selectByValue("1990");
			
			Thread.sleep(5000);
			Mymonth.selectByIndex(3);
			
			// Enter Birthday
			//Birth_Day.sendKeys("15");
			//Birth_Month.sendKeys("May");
			//Birth_Year.sendKeys("1985");
			
			
			
			//identify the Gender
			
			WebElement Gender = fbapp.findElement(By.xpath("//input[@value='2']"));
					//id("u_0_9"));
					//xpath("//input[@name='sex'&& @value='1']"));	
			
			//Enter Gender
			Gender.click();
			
			

	}
	

}
