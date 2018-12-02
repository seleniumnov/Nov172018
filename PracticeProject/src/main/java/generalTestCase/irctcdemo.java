package generalTestCase;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctcdemo {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.manage().window().maximize();
			WebElement from = driver.findElement(By.xpath("//input[@placeholder='From*']"));
			from.sendKeys("SECUNDERABAD JN - SC");
			// div[@class='ng-tns-c14-6 ui-datepicker ui-widget ui-widget-content
			// ui-helper-clearfix ui-corner-all ui-shadow ng-trigger
			// ng-trigger-overlayState']/table/tbody/tr/td
			// div[@class='ng-tns-c14-6 ui-datepicker ui-widget ui-widget-content
			// ui-helper-clearfix ui-corner-all ui-shadow ng-trigger
			// ng-trigger-overlayState']/table/tbody/tr/td
			WebElement to = driver.findElement(By.xpath("//input[@placeholder='To*']"));
			to.sendKeys("NELLORE - NLR");
			// List<WebElement>
			// dates1=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar
			// ng-tns-c14-6 ng-star-inserted']/tbody/tr/td"));
			List<WebElement> dates1 = driver.findElements(By.xpath(
					"//div[@class='ng-tns-c14-6 ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-shadow ng-trigger ng-trigger-overlayState']/table/tbody/tr/td"));
			for (int i = 0; i < dates1.size(); i++) {
				if (!dates1.get(i).getText().equals(" ")) {
					if (dates1.get(i).getText().equals("22")) {
						dates1.get(i).click();
					}

				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
