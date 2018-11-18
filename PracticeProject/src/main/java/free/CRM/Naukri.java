package free.CRM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String parent = driver.getWindowHandle();

		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());

		System.out.println("Total Windows " + windows.size());

		for (int i = 1; i <= windows.size(); i++) {

			if (!parent.equals(driver.switchTo().window(windows.get(i)))) {

				driver.switchTo().window(windows.get(i));

			}
		}

	}

}
