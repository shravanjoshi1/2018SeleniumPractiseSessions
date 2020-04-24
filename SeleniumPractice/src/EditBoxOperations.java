import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxOperations {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//Set Browser Path	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		
	//Create Browser instance
		WebDriver fbapp =new ChromeDriver();
		
	//Open Application
		fbapp.get("http://www.facebook.com");
		
	//Maximize the Window
		fbapp.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// Input category count
		
		int inputCount = fbapp.findElements(By.xpath("//input")).size();
		System.out.println(inputCount);
		
		//Edit Box count
		int EditCount = fbapp.findElements(By.xpath("//input[@type='text']")).size();
		System.out.println(EditCount);
		
		//Identify the Specific Edit Box (First Name)
		
		WebElement Fname = fbapp.findElement(By.name("firstname"));
		
		// First Name exist or not
		
		if((Fname.isDisplayed())==true)
		{
			System.out.println("First name is displayed");
		}
		else
		{
			System.out.println("First name is not displayed");
		}
		
		//First name enabled or not
		
		if((Fname.isEnabled())==true)
		{
			System.out.println("First Name is enabled");
		}
		else
		{
			System.out.println("First name is not enabled");
		}
		
		//Enter Data in First Name
		
		Fname.sendKeys("Shravan");
		
		//Capture Data from Edit box
		
		String myname = Fname.getAttribute("value");
		System.out.println(myname);
		
		Thread.sleep(5000);
		
		//Clear the value
		fbapp.findElement(By.name("firstname")).clear();
		
	}
	
}

