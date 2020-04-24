import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		options.addArguments("disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span")).click();
		for (int i = 1; i < 4; i++) {
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();

			Thread.sleep(2000);
		}
		// Row Count

		int rows = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr")).size();
		System.out.println(rows);

		// Column Count

		int columns = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[3]/td")).size();
		System.out.println(columns);

		// Select Specific Day {28}

		for (int i = 3; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {

				// Identify the general cell

				WebElement MyDate = driver.findElement(
						By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td[" + j + "]"));

				// Capture Data

				String MyDateData = MyDate.getText();
				System.out.println(MyDateData);
				if ((MyDateData.equalsIgnoreCase("30")) == true) {
					// WebElement MyDatereq =
					// driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td["+j+"]"));
					// MyDatereq.click();
					MyDate.click();
					break;
				}

			}

		}

	}
}