import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RandomTesting {
public static WebDriver driver;	
public static  String BrowserName;

	public static void main(String[] args) {
		
	try {
		System.setProperty("webdriver.ie.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		BrowserName = "Internet Explorer Browser";;
		 driver.get("https://www.google.com/");
	     String PageTitle =driver.getTitle();
	     if(PageTitle.equals("Google"))
	     {
	    	 System.out.println(BrowserName +  "Google is Launched");
	     }
	     
	     else
	     {
	    	 System.out.println(BrowserName +  "Google is not Launched");
	     }
	     
		 driver.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
	}
	

	}

}
