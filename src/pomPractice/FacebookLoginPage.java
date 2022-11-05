package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	//DECLARATION
	@FindBy  (id="email")
	private WebElement emailEdt;
	
	@FindBy(id="pass")
	private WebElement passwordEdt;
	
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	//INITIALIZATION
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//UTILIZATION
	public void loginToFacebook(String username,String password)
	{
		emailEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();	
	}
}
