import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
	//Cross Browser Testing
	//Test Case -1 : Launching google.com in multiple browsers
	public  static WebDriver driver;
	public static int browser;
	public static String BrowserName;

	public static void main(String[] args) {
		
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts(); */
		
		for(browser =1 ; browser <=3; browser++) {
			
			if(browser == 1)
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");				
				 driver = new ChromeDriver();
				 BrowserName = "Chrome Browser";
			}
			else if (browser == 2)
			{
				System.setProperty("webdriver.ie.driver","C:\\Users\\User\\Desktop\\SeleniumSoftwares\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				BrowserName = "Internet Explorer Browser";
			}
			else if(browser == 3)
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\geckodriver.exe");
				driver = new FirefoxDriver();				
				BrowserName = "Mozilla Firefox Browser";
				
			}
			
			driver.get("https://www.google.com/");
			 String PageTitle = driver.getTitle();
			 
			 if (PageTitle.equals("Google")) {
				 System.out.println(BrowserName + " Google Application Launched - Passed");
				 
			 }
			 else
			 {
				 System.out.println(BrowserName +  "Google Application Not Launched - Failed");
			 }
			 driver.close();
			 }
						
		}
		
	}


