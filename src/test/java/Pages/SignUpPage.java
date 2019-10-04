package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import managers.FileReaderManager;

public class SignUpPage {
	
	WebDriver driver;
	
	public SignUpPage (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//*[@id="header"]/div[2]/div/div/nav/div[1]/a
	
	@FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a") 
	 private WebElement Signin;
	
	@FindBy(how = How.ID, using = "email_create") 
	 private WebElement EmailCreate;
	
	@FindBy(how = How.ID, using = "SubmitCreate") 
	 private WebElement SubmitCreate;
	
	@FindBy(how = How.ID, using = "id_gender2") 
	 private WebElement Gender;
	
	@FindBy(how = How.ID, using = "customer_firstname") 
	 private WebElement CustomerFirstName;
	
	@FindBy(how = How.ID, using = "customer_lastname") 
	 private WebElement CustomerLastName;
	
	@FindBy(how = How.ID, using = "email") 
	 private WebElement Email;

	@FindBy(how = How.ID, using = "passwd") 
	 private WebElement Password;
	
	@FindBy(how = How.ID, using = "days") 
	 private WebElement Days;
	
	@FindBy(how = How.ID, using = "months") 
	 private WebElement Months;
	
	@FindBy(how = How.ID, using = "years") 
	 private WebElement Years;
	
	@FindBy(how = How.ID, using = "firstname") 
	 private WebElement FirstName;
	
	@FindBy(how = How.ID, using = "lastname") 
	 private WebElement LastName;
	
	@FindBy(how = How.ID, using = "address1") 
	 private WebElement Address1;
	
	@FindBy(how = How.ID, using = "city") 
	 private WebElement City;
	
	@FindBy(how = How.XPATH, using = "//*[@id='id_state']/option[2]")
	private WebElement State;
	
	@FindBy(how = How.ID, using = "postcode") 
	 private WebElement PostCode;
	
	@FindBy(how = How.ID, using = "phone_mobile") 
	 private WebElement Mobile;
	
	@FindBy(how = How.ID, using = "submitAccount") 
	 private WebElement SubmitAccount;
	
	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/p")
	 private WebElement WelcomeText;
	
		
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void clickSignin(){
		Signin.click();
	}
	
	public void enterEmail(String email){
		EmailCreate.sendKeys(email);
	}
	
	
	public void clickCreateAccount(){
		SubmitCreate.click();	
	}
	
	public void clickGender(){
		Gender.click();
	}
	
	public void enterCustomerFirstName(String fname){
		CustomerFirstName.sendKeys(fname);
	}
	
	public void enterCustomerLastName(String lname){
		CustomerLastName.sendKeys(lname);
	}
	
	public void enterPassword(String pw){
		Password.sendKeys(pw);
	}
	
	public void enterAddress(String add){
		Address1.sendKeys(add);
	}
	
	public void enterPostCode(String p){
		PostCode.sendKeys(p); 
	}
	
	
	public void enterCity(String ct){
		City.sendKeys(ct);
	}
	
	public void enterMobile(String ph){
		Mobile.sendKeys(ph);
	}
	
	public void clickSubmit(){
		SubmitAccount.click();
	}
	
	public void getState(){
		State.click();
	}
	
	public void fillEMail(){
		enterEmail("test1344@gmail.com");
	}

	public void fillPersonalDetails(){
		enterCustomerFirstName("Test");
		enterCustomerLastName("Ignore");
		enterPassword("test123");
	}
	
	public void fillAddress(){
		enterAddress("Test address");
		enterPostCode("34256");
		getState();
		enterCity("London");
	}
	
	public void fillMobile(){
		enterMobile("07654777554");
	}
	
	
	public void confirmText(){
		String ExptdText = "Welcome to your account. Here you can manage all of your personal information and orders.";
		String ActualText = WelcomeText.getText();
		Assert.assertEquals(ExptdText, ActualText);
		
	}
	

}
