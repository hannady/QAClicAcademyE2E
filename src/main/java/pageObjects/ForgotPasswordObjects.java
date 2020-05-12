package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordObjects {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='user_email']")
	public WebElement inputEmail;
	@FindBy(xpath="//*[@id=\"new_user\"]/center/input")
	public WebElement submit;
	
	
	public ForgotPasswordObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public WebElement getinputEmail() {
		return inputEmail;
		
	}
	public WebElement getSubmit() {
		
		return submit;
	}

}
