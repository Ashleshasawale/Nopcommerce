package nopcommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeNopcommerce

{
	
	@FindBy(xpath="//a[text()='Register']") private WebElement register;
	@FindBy(xpath="//a[text()='Log in']")private WebElement login;
	@FindBy(xpath="//span[text()='Wishlist']") private WebElement wishlist;
	@FindBy(xpath="//span[text()='Shopping cart']") private WebElement shoppingcart;
	
	
	public HomeNopcommerce(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickonReg() 
	{
		register.click();
	}
	public void ClickonLogin()
	{
		login.click();
	}
	public void ClickonWishlist()
	{
	wishlist.click();
	}
	public void ClickonShoppingcart()
	{
		shoppingcart.click();
	}
}
