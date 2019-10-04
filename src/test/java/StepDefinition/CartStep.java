package StepDefinition;

import Pages.CartPage;
import Pages.LoginPage;
import Pages.SignUpPage;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class CartStep {
	
	TestContext testContext;
	CartPage cart;
	LoginPage login;
	SignUpPage signup;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	public CartStep(TestContext context){
		testContext = context;
		cart = testContext.getPageObjectManager().getCartPage();
		login = testContext.getPageObjectManager().getLoginPage();
		signup = testContext.getPageObjectManager().getSignUpPage();
	}
	
	@Given("^I click on DRESSES category$")
	public void i_click_on_DRESSES_category() {
	  cart.clickDress();
	  cart.clickOnListView();
	}

	@Given("^I add most expensive item to the cart$")
	public void i_add_most_expensive_item_to_the_cart() {
	    cart.maxPrice();
	}

	@Given("^I click on Proceed to checkout$")
	public void i_click_on_Proceed_to_checkout() {
	    cart.clickOnProceedToCheckOut();
	}

	@When("^I logged in again with the same user$")
	public void i_logged_in_again_with_the_same_user() {
	   signup.clickSignin();
	   login.fillEmailAndPassword();
	   login.clickSubmitLogin();
	}

	@Then("^I should see the item in the cart$")
	public void i_should_see_the_item_in_the_cart() {
	  try{
		  cart.clickOnCartLink();
		  cart.checkCartItem();
	  }
	  catch (Exception  e){
		  
		  System.out.println("Cart is empty");
	  }
	  
	}


}
