package generalTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spiceemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//ul[@class='autoFill']/li[1]
		System.setProperty("webdriver.chrome.driver", "D:\\selenium softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMImMrgqvTd3gIVgZSPCh01gAAREAAYASAAEgKZM_D_BwE");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("ul[@class='autoFill']/li[1]"));

	}

}
