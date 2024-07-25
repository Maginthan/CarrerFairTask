package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class HomePage extends AbstractComponent{
	//WebDriver instance
	WebDriver driver;
	
	//Page Factory for webElemetns of LoginPage
	@FindBy(id="menu-toggle")
	WebElement menuToggle;
	@FindBy(xpath = "//ul[@class =\"sidebar-nav\"]/li/a[contains(text(),\"Login\")]")
	WebElement loginButton;
	
	//By type for passing to explicit wait utility method
	By loginBy = By.xpath("//ul[@class =\"sidebar-nav\"]/li/a[contains(text(),\"Login\")]");
	
	//Constructor for providing the driver initialization
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Public method to go to URL
	public void goTo() {
		String url = "https://katalon-demo-cura.herokuapp.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//Public method to wait for login option to appear in toggle
	public void selectLogin() {
		waitForElementToBeVisible(loginBy);
		loginButton.click();
	}
	
	
	//Public mehtod to click the menuToggle
	public void clickToggle() {		
		menuToggle.click();
	}
	
	


}
