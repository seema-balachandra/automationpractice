package Pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import net.bytebuddy.TypeCache.Sort;

public class CartPage {
	WebDriver driver;
	String ExpectedMaxPrice = "$50.99";
	
	public CartPage (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a") 
	 private WebElement DressLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='list']/a/i") 
	 private WebElement ListView;
	
	@FindAll(@FindBy(how = How.CSS, using = "span.price.product-price")) 
	private List<WebElement> PriceList;
	
	@FindAll(@FindBy(how = How.CSS, using = "a.button.ajax_add_to_cart_button.btn.btn-default")) 
	private List<WebElement> CartList;
	
	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li[1]/div/div/div[3]/div/div[1]/span")
	private WebElement price;
	
	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
	private WebElement CheckOut;
	
	@FindBy(how = How.XPATH, using = "//*[@id='header']/div[3]/div/div/div[3]/div/a")
	private WebElement Cart;
	
	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li[2]/div/div/div[3]/div/div[1]/span")
	private WebElement MaxPrice;
	
	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li[1]/div/div/div[3]/div/div[2]/a[1]")
	private WebElement MaxCartLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='product_price_4_16_0']")
	private WebElement CartItemPrice;	
	
	
	public void clickDress(){
		DressLink.click();
	}
	
	public void clickOnListView(){
		ListView.click();
	}
	
	
	public void clickOnProceedToCheckOut(){
		CheckOut.click();
	}
	
	public void clickOnCartLink(){
		Cart.click();
	}
	
	//Get the max item price in the category and cart item price which is already added, and check both are equal
	public void checkCartItem(){
		int pricelistsize = PriceList.size();
		Double ExpectedMaxPrice;
		Double ActualPrice;
		String t;
		Double max = 0.0;
		Double temp;
		for(int i =1; i<=pricelistsize; i=i+2){
			t=PriceList.get(i).getText();
			t = t.substring(1);
			temp = Double.parseDouble(t);
			System.out.println(temp);
			if (temp > max){
				max = temp;
				}
			}
		ExpectedMaxPrice = max;
		String s = CartItemPrice.getText().substring(1);
		ActualPrice = Double.parseDouble(s);
		System.out.println("Actual price in the cart is " +ActualPrice);
		System.out.println("Expected price in the cart is " +ExpectedMaxPrice);
		Assert.assertEquals(ExpectedMaxPrice, ActualPrice);
	}
	
		
	//Iterate price in a loop until all price converts to double, print the max price and add max item to the cart.
	public void maxPrice(){
		int pricelistsize = PriceList.size();
		String t;
		Double max = 0.0;
		Double temp;
		int CartIndex = 0;
		int j=-1;
		for(int i =1; i<=pricelistsize; i=i+2){
			j = j+1;
			t=PriceList.get(i).getText();
			t = t.substring(1);
			temp = Double.parseDouble(t);
			System.out.println(temp);
			if (temp > max){
				max = temp;
				CartIndex = j;
				}
			}
		System.out.println("Max price in Dress category is = " +max);
		System.out.println("Max priced cart index is " +CartIndex);
		CartList.get(CartIndex).click();
		
	}
	
	//Get Max price
	
	
		
		
		
	}


