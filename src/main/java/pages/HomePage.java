package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class HomePage {
	
	private WebDriver driver;
	
	// Constructor 
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	// Element Locators 
	
	By myAccount_button = By.xpath("//a[contains(.,'My Account')]");
	By signup_button = By.xpath("//a[contains(.,'Sign Up') and contains(@class,'dropdown')]");
	
	// Actions
	
	public void navigateToSignUpPage() {
		ElementActions.click(driver, myAccount_button);
		ElementActions.click(driver, signup_button);
		
		
	}
	
	

}
