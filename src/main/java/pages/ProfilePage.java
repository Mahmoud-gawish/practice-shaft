package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class ProfilePage {
	
	private WebDriver driver;
	
	// Constructor 
	
	public ProfilePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	// Element Locators 
	private By himassage_text = By.xpath("//h3[contains(.,'Hi, mahmoud gawish')]");
	
	
	
	
	// Actions
	
	public String getHiMassageText() {
		
	return	ElementActions.getText(driver, himassage_text);
	}
	

	public By getHimAassageLocation() {
		
		return himassage_text;
	}
	
	
	

}
