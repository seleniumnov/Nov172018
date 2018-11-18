package generalTestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("29-11-2018");
			driver.findElement(By.xpath("//p-dropdown[@id=\"journeyClass\"]/div/div[3]")).click();
			
			List<WebElement> classes = driver.findElements(By.xpath("//*[@id='journeyClass']/div/div[4]/div/ul/li"));
			
			for (WebElement ele : classes) {
				
				System.out.println("Class Type: "+ele.getText());
				if (ele.getText().equals("First Class (FC)")) {
					
					ele.click();
					break;
				}
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
