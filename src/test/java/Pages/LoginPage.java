package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "email") 
	 private WebElement Email;

	@FindBy(how = How.ID, using = "passwd") 
	 private WebElement Password;
	
	@FindBy(how = How.ID, using = "SubmitLogin") 
	 private WebElement SubmitLogin;
	
	@FindBy(how = How.CSS, using = "a.logout") 
	 private WebElement SignOut;
	
	@FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a") 
	 private WebElement SignInText;
	
	public void fillEmailAndPassword(){
		Email.sendKeys("seema.sorab@gmail.com");
		Password.sendKeys("test123");
	}
	
	public void clickSubmitLogin(){
		SubmitLogin.click();
	}
	
	public void clickSignOut(){
		SignOut.click();
	}
	
	public void getSignInText(){
		String ExpectedText = "Sign in";
		String ActualText = SignInText.getText();
		Assert.assertEquals(ExpectedText, ActualText);
	}

}
