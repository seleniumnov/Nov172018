package free.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreecrmTC {
	
	WebDriver driver;
	
	@BeforeClass
	public void initApp() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.freecrm.com");
			Thread.sleep(3000);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
	
	@Test(priority=1)
	public void login() {
		
		System.out.println("Login");
	}
	
	@Test(priority=0)
	public void signUp() {
		try {			
			//clicking on signup  and entering the details
			driver.findElement(By.xpath("//font[@color='red']")).click();
			new Select(driver.findElement(By.xpath("//select[@id='payment_plan_id']"))).selectByVisibleText("Free Edition");
			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Anil");
			driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("kumar");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@mailinator.com");
			driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("test@mailinator.com");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Anilone");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anilone");
			driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys("Anilone");
			driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
			
			//clicking on submit button
			driver.findElement(By.xpath("//button[@id='submitButton']")).click();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
