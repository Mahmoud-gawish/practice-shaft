package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;

import pages.HomePage;

public class SignUpTest{
 
	private HomePage homeObject;
//	private SignUpPage signupObject;
//	private ProfilePage profileObject;
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		
		 driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver, "https://phptravels.net/home");
	}

	
	@Test
  public void signupTest() {
		
		homeObject = new HomePage(driver);
		homeObject.navigateToSignUpPage();
//		signupObject = new SignUpPage(driver);
//		signupObject.navigateToSignUpPage("mahmoud", "gawish", "12345678912", "test4@rere.com", "123123", "123123");
//		profileObject = new ProfilePage(driver);
//		
//		Assertions.assertEquals("Hi, mahmoud gawish", profileObject.getHiMassageText());
//		Assertions.assertElementAttribute(driver, profileObject.getHimAassageLocation(),ElementAttributeType.TEXT, "Hi, mahmoud gawish");
//		
  }
}
