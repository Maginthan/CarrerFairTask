package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Web Driver instance for Chrome browser
		WebDriver driver = new ChromeDriver();
		
		HomePage homePage = new HomePage(driver);
		homePage.goTo();
		homePage.clickToggle();
		homePage.selectLogin();

		
		//Validating with valid user name and password
		LoginPage loginPage = new LoginPage(driver);
		String actualText = loginPage.LoginPageVisible();
		
		Assert.assertEquals(actualText, "Login");
}
}
