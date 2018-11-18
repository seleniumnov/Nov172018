package spiceJet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlight {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

			driver.findElement(By.xpath("//a[contains(text(),'Hyderabad (HYD)')]")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("(//a[contains(text(),'Thiruvananthapuram (TRV)')])[2]")).click();

			List<WebElement> dates = driver
					.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));

			for (int i = 0; i < dates.size(); i++) {

				if (!dates.get(i).getText().equals(" ")) {

					if (dates.get(i).getText().equals("22")) {

						dates.get(i).click();
						break;
					}
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
