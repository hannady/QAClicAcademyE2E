package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	public WebDriver driver;

	@FindBy(xpath = "//ul[@class='pull-left']//li[1]/a/span")
	private WebElement phoneNumber;
	@FindBy(xpath = "//ul[@class='pull-left']//li[2]/a/span")
	private WebElement email;
	@FindBy(xpath = "//*[@id='homepage']/header/div[2]/div/nav/ul/li")
	private WebElement navigatonBar;
	@FindBy(xpath = "//div[@class='col-sm-6 col-md-8 hidden-xs video-banner']/h3")
	private WebElement firstheder;
	@FindBy(xpath = "//*[@id=\"myCarousel\"]/div/div/div/div/div[1]/p")
	private WebElement secondheder;
	@FindBy(xpath = "//body[@id='homepage']/section[1]/div[1]/ul[1]/li")
	private List<WebElement> allcourses;
	@FindBy(xpath = "//*[@id=\"welcome\"]/div/div/div/div[1]/div/div[2]/h3")
	private WebElement firstTextofFooter;
	@FindBy(xpath="//p[contains(text(),'Join Our Newsletter')]")
	private WebElement newsletter;
	@FindBy(xpath="//button[contains(text(),'NO THANKS')]")
	private WebElement buttonNoThanx;

	public HomePageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getPhonenNumber() {

		return phoneNumber;
	}

	public WebElement getEmail() {

		return email;
	}

	

	public WebElement getNavigationBar() {

		return navigatonBar;
	}

	public WebElement getFirstHeder() {

		return firstheder;

	}

	public WebElement getSecondHeder() {
		return secondheder;
	}

	public List<WebElement> getallCourses() {
		
		return  allcourses;
		
	}	
	public WebElement getfirstTextOfFooter() {

		return firstTextofFooter;
	}
	public WebElement getNewsletter() {
		
		return newsletter;
	}
	public WebElement getbuttonNot() {
		return buttonNoThanx; 
		
	}
}
