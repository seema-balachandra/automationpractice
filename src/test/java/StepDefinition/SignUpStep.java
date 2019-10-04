package StepDefinition;

import Pages.SignUpPage;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class SignUpStep {
	TestContext testContext;
	SignUpPage signup;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	public SignUpStep(TestContext context){
		testContext = context;
		signup = testContext.getPageObjectManager().getSignUpPage();
	}
	

	@Given("^I am on the home page of the application$")
	public void i_am_on_the_home_page_of_the_application(){
    signup.navigateTo_HomePage();
	}

	@Given("^I click on Sign in link$")
	public void i_click_on_Sign_in_link(){
    signup.clickSignin();
	}

	@Given("^I enter my emailid$")
	public void i_enter_my_emailid() {
    signup.fillEMail();
	}

	@Given("^I click on Create an account button$")
	public void i_click_on_Create_an_account_button(){
	signup.clickCreateAccount();	
	}

	@Given("^I enter my personal details$")
	public void i_enter_my_personal_details() {
	   signup.fillPersonalDetails(); 
	}

	@Given("^I enter my address details$")
	public void i_enter_my_address_details() {
	  signup.fillAddress();  
	}
	
	@Given("^I enter my phone number$")
	public void i_enter_my_phone_number() {
	   signup.fillMobile(); 
	}
	
	@When("^I click on Register$")
	public void i_click_on_Register(){
	   signup.clickSubmit(); 
	}
	
	@Then("^I should successfully navigated to my account page$")
	public void i_should_successfully_navigated_to_my_account_page(){
	 signup.confirmText();   
	}

	@Then("^I should see the welcome text$")
	public void i_should_see_the_welcome_text() {
	    
	}


}
