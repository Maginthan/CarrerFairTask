package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent{
	//WebDriver instance
	WebDriver driver;
	
	//Page Factory for webElemetns of HomePage
	@FindBy(id="txt-username")
	WebElement userEmail;
	@FindBy(id="txt-password")
	WebElement userPassword;
	@FindBy(id="btn-login")
	WebElement loginButton;
	@FindBy(xpath="//div[contains(@class, \"col-sm-12\")]/h2")
	WebElement loginText;
	
	//Constructor for providing the driver initialization
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginApplication(String userName, String password) {
		userEmail.sendKeys(userName);
		userEmail.sendKeys(password);
		loginButton.click();
	}
	
	public String LoginPageVisible() {
		return loginText.getText();
	}
	
	

}
