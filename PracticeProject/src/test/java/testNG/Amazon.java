package testNG;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import webpages.AmazonTestCase4;

public class Amazon {
	
	WebDriver driver;
	
	public void wait(WebElement ele) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void captureScreen() {
	
		try {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter def = DateTimeFormatter.ofPattern("ddmmyyhhmmss");
			String timeStamp = def.format(now);
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./ScreenShots/"+timeStamp+".png"));
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	public void getBrowser(String browserName) {
		
		switch (browserName) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			break;
		default:
			System.out.println("Please select valid browser name");
			break;
		}
		
	}
	
	@BeforeClass
	@Parameters("browser")
	public void init(String name) {
		getBrowser(name);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void todayDeals() {
		try {
			AmazonTestCase4 amazon = new AmazonTestCase4(driver);
			amazon.Today.click();
			for (int i = 1; i <=amazon.departmentDeals.size(); i++) {
				WebElement check = driver.findElement(By.xpath("//div[@aria-live='polite']/span["+i+"]/div/label/input"));
				check.click();
				captureScreen();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
