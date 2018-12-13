package Anil;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webpages.AmazonCategoryPage;
import webpages.HomePage;

public class AmazonTC1 {
	WebDriver driver;

	public void capturescreenshot() {
		try {
			LocalDateTime today = LocalDateTime.now();
			DateTimeFormatter cur = DateTimeFormatter.ofPattern("ddmmyyhhmmss");
			String time = cur.format(today);
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./ScreenShots/" + time + ".png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod(alwaysRun=true)
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test(groups="Smoke",alwaysRun=true)
	public void category() {
		
		AmazonCategoryPage category = PageFactory.initElements(driver, AmazonCategoryPage.class);
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		try {

			Thread.sleep(2000);
			//WebElement mo1 = driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
			Actions action1 = new Actions(driver);
			action1.moveToElement(category.topMenuShopAll).build().perform();
			capturescreenshot();
			Thread.sleep(2000);
			//WebElement mo2 = driver.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']"));
			Actions action2 = new Actions(driver);
			action2.moveToElement(category.mo2).build().perform();
			capturescreenshot();
			Thread.sleep(2000);
			
			for (WebElement link : category.links) {
				System.out.println(link.getText());
				if (link.getText().equalsIgnoreCase("Cameras")) {
					link.click();
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
