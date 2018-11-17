package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//open any application
		driver.get("https://www.google.com");
		
		driver.get("http://selenium4testing.com/hms/");
		
		// Browser Commands
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
			
		driver.navigate().to("https://www.freecrm.com/index.html");
		
		
		String title = driver.getTitle();
		// enter user and pass
		String atitle = driver.getTitle();
		
		System.out.println(title);
		
		System.out.println(driver.getPageSource());
		
		//close the browser
		
		driver.close();
	}

}
