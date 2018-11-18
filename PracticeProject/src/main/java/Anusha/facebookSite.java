package Anusha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class facebookSite {

	public static void main(String[] args) {
		// TODO Auto-generated method sting
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		/*driver.navigate().to("https://www.facebook.com");*/
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("anusha");
		driver.findElement(By.xpath("//input[@aria-label= 'Surname']")).sendKeys("Vutukuri");
		driver.findElement(By.xpath("//input[@aria-label= 'Mobile number or email address']")).sendKeys("siri@gmail.com");
		driver.findElement(By.xpath("//input[@name= 'reg_email_confirmation__']")).sendKeys("siri@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("asdfgh");
		Select drpDate = new Select(driver.findElement(By.name("birthday_day")));
		drpDate.selectByVisibleText("15");
		Select drpMonth = new Select(driver.findElement(By.name("birthday_month")));
		drpMonth.selectByVisibleText("Dec");
		Select drpYear = new Select(driver.findElement(By.name("birthday_year")));
		drpYear.selectByVisibleText("2015");	
		driver.findElement(By.xpath("//input[@type = 'radio'][@value ='2']")).click();
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
		
		
		

		
	}

}