package browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitInSelenium {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// default wait is 0
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.freecrm.com/index.html");

		// init explicit wait
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement signUp = driver.findElement(By.xpath("//font[contains(text(),'Sign Up')]"));

		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(signUp));*/
		
		Thread.sleep(3000);
		
		signUp.click();
		
		driver.findElement(By.xpath("//a[text()='Support']")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
		
		
		
		//userName.sendKeys("jagadeesh232708");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jagadeeshjaggu");

	}

}
