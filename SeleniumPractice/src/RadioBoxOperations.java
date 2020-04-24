import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBoxOperations {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		try {
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
				
				//Radio button count
				
				int RBCount = fbapp.findElements(By.xpath("//input[@type='radio']")).size();
				System.out.println(RBCount);
				
				//Identify the Female Radio button
				
				WebElement FRadio = fbapp.findElement(By.xpath("//input[@value='1']"));
				
				//Female Radio Button exist or not
				
				if((FRadio.isDisplayed())== true)
				{
					System.out.println("Female Radio button exist");
				}
				
				else
				{
					System.out.println("Female Radio button doesn't exist");
				}
				
				//Female Radio is enabled or not
				
				if((FRadio.isEnabled())== true)
				{
					System.out.println("Female Radio button enabled");
				}
				
				else
				{
					System.out.println("Female Radio button not enabled");
				}
				
				//Verify Default status
				
				if((FRadio.isSelected())== true)
				{
					System.out.println("Female Radio button by default selected");
				}
				
				else
				{
					System.out.println("Female Radio button by default is not selected");
				}
				
			//Select Female Radio Button
				
				FRadio.click();
			// Verify select status
				
				if((FRadio.isSelected())== true)
				{
					System.out.println("Female Radio button selected ");
				}
				
				else
				{
					System.out.println("Female Radio button is not selected");
				}
				
		
				
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
