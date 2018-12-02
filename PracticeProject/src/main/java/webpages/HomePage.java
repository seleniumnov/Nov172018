package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	//webElement user = driver.findElement(By.name("username"));
	
	@FindBy(name="username")
	public WebElement userName;
	
	
	@FindBy(how=How.NAME,using="password")
	public WebElement passWord;

	@FindBy(how=How.XPATH,using="//input[@value='Login']")
	public WebElement login;
}
