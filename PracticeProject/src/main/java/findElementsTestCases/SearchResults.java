package findElementsTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResults {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		List<WebElement> results = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(results.size());
		
		for (WebElement ele : results) {
			
			System.out.println(ele.getText());
			
			if (ele.getText().equals("selenium maven dependency")) {
				
				ele.click();
				break;
			}
		}
		
		List<WebElement> res = driver.findElements(By.xpath("//div[@class='r']/a/h3"));
		
		System.out.println(res.size());
		
		for (int i = 0; i < res.size(); i++) {
			
			System.out.println(res.get(i).getText());
			
			if (res.get(i).getText().equals("Maven & Jenkins with Selenium: Complete Tutorial - Guru99")) {
				
				res.get(i).click();
				break;
			}
		}
	}

}
