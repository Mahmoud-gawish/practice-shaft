package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class SignUpPage {

	private WebDriver driver;

	// Constructor 

	public SignUpPage(WebDriver driver) {

		this.driver = driver;

	}

	// Element Locators 

	private	By firstname_box = By.name("firstname");
	private	By lastName_box = By.name("lastname");
	private	By phone_box = By.name("phone");
	private By email_box = By.name("email");
	private By password_box = By.name("password");
	private By confirmpassword_box = By.name("confirmpassword");
	private By signUp_button = By.xpath("//button[contains(.,'Sign Up')]");



	// Actions

	public void navigateToSignUpPage(String firstname, String lastname, String phone, String email ,String password , String confirmpass ) {
		new ElementActions(driver)
		.type( firstname_box,firstname)
		.type( lastName_box, lastname)
		.type( phone_box, phone)
		.type( email_box, email)
		.type( password_box, password)
		.type( confirmpassword_box,confirmpass)
		.click( signUp_button);


	}



}
