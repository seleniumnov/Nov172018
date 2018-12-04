package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonTestCase4 {

	public AmazonTestCase4(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[@aria-live='polite']/span/div/label/input")
	public List<WebElement> departmentDeals;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Today')]")
	public WebElement Today;

}
