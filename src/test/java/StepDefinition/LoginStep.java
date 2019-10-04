package StepDefinition;

import Pages.LoginPage;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class LoginStep {
	
	TestContext testContext;
	LoginPage login;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	public LoginStep(TestContext context){
		testContext = context;
		login = testContext.getPageObjectManager().getLoginPage();
	}
	
	@Given("^I fill my email and password$")
	public void i_fill_my_email_and_password()  {
	 login.fillEmailAndPassword();   
	}

	@Given("^I click on Sign in button$")
	public void i_click_on_Sign_in_button()  {
	  login.clickSubmitLogin();  
	}

	@When("^I click on Signout button$")
	public void i_click_on_Signout_button()  {
	  login.clickSignOut();  
	}

	@Then("^I should see the Sign In text$")
	public void i_should_see_the_Sign_In_text() {
	   login.getSignInText(); 
	}


}
