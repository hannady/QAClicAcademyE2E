package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	public WebDriver driver;
	
	
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement login;
	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement password;
	@FindBy(xpath="//input[@name='commit']")
	private WebElement sumbit;
	@FindBy(xpath="//a[@class='link-below-button']")
	private WebElement forgotpassword;
	
	public LoginPageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getemail() {
		
		return email; 
		
	}
	public WebElement getpassword() {
		
		return password;
	}
	
	public ForgotPasswordObjects forgotPassword() {
		forgotpassword.click();
		ForgotPasswordObjects fp = new ForgotPasswordObjects(driver);
		return fp;
		
	}
	
 
	
}



