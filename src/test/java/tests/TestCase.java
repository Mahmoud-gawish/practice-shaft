package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.ElementAttributeType;

public class TestCase {
	
	@Test
	public void newTest() {
		
		WebDriver driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver, "https://phptravels.net/home");
		
		ElementActions.click(driver, By.xpath("//a[contains(.,'My Account')]"));
		ElementActions.click(driver, By.xpath("//a[contains(.,'Sign Up') and contains(@class,'dropdown')]"));
		
		ElementActions.type(driver, By.name("firstname"), "mahmoud");
		ElementActions.type(driver, By.name("lastname"), "gawish");
		ElementActions.type(driver, By.name("phone"), "12345678901");
		ElementActions.type(driver, By.name("email"), "test@tesuurr4cee.com");
		ElementActions.type(driver, By.name("password"), "12345677");
		ElementActions.type(driver, By.name("confirmpassword"),"12345677");
		ElementActions.click(driver, By.xpath("//button[contains(.,'Sign Up')]"));
		
		Assertions.assertEquals("Hi, mahmoud gawish", ElementActions.getText(driver, By.xpath("//h3[contains(.,'Hi, mahmoud gawish')]")));
		Assertions.assertElementAttribute(driver, By.xpath("//h3[contains(.,'Hi, mahmoud gawish')]"),ElementAttributeType.TEXT, "Hi, mahmoud gawish");
		
		
		
		
	}

}
