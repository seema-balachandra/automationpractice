package managers;

import org.openqa.selenium.WebDriver;

import Pages.CartPage;
import Pages.LoginPage;
import Pages.SignUpPage;

public class PageObjectManager {
	private WebDriver driver;
	private LoginPage login;
	private CartPage cart;
	private SignUpPage signup;
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	
	public LoginPage getLoginPage(){

		return (login == null) ? login = new LoginPage(driver) : login;

	}
	
	public CartPage getCartPage(){
		return (cart == null) ? cart = new CartPage(driver) : cart;
	}
	
	public SignUpPage getSignUpPage(){
		return (signup == null) ? signup = new SignUpPage(driver): signup;
	}

}
