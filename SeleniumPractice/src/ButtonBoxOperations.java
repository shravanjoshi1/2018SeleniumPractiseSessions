import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonBoxOperations {

	public static void main(String[] args) {
		try {
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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
