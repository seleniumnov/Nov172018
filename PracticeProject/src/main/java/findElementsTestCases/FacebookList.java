package findElementsTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookList {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> waterMark = driver.findElements(By.xpath("//input[starts-with(@id,'u_0')]"));
		
		System.out.println(waterMark.size());
		
		for (WebElement ele : waterMark) {
			
			if (!ele.getAttribute("type").equals("hidden")) {
				
				if (ele.getAttribute("aria-label").equals("First name")) {
					
					ele.sendKeys("Test Demo");
					
				}else if(ele.getAttribute("aria-label").equals("Surname")) {
					
					ele.sendKeys("Demo SurName");
					
				}else if (ele.getAttribute("aria-label").equals("Mobile number or email address")) {
					
					ele.sendKeys("9966890198");
				}
			}
		}
	}

}
