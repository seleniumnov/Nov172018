package browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// default wait is 0
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("(//input[starts-with(@id,'u_0')])[4]")).sendKeys("Suuresh");
		
		driver.findElement(By.xpath("//label[contains(text(),'Email or Phone')]/following::input[1]")).sendKeys("skurry189@gmail.com");
		
			
		//driver.findElement(By.xpath("//input[@aria-label='Log In'][@value='Log In']")).click();

	}

}
