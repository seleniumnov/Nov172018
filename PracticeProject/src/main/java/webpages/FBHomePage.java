package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBHomePage {
	
	@FindBy(name="firstname")
	public WebElement userName;
	
	
	@FindBy(how=How.NAME,using="sex")
	public WebElement passWord;

	

}
