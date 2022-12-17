package nopcommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import nopcommerceBASENUtility.UtilityNopcommerce;

public class Register {

	
	@FindBy(id="FirstName") private WebElement FN;
	@FindBy(id="LastName")  private WebElement LN;
	
	@FindBy(id="Email")  private WebElement Mail;
	
	@FindBy(name="DateOfBirthDay")private  WebElement dob;
	@FindBy(name="DateOfBirthMonth")private  WebElement dom;
	@FindBy(name="DateOfBirthYear")private  WebElement doy;
	
	@FindBy(id="Password") private WebElement password;
	@FindBy(id="ConfirmPassword") private WebElement confirmpassword;
	@FindBy(xpath="//button[text()='Register']") private WebElement register;
	
	
	
	
	
	
	
	
	
	
	
	
	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Regname(WebDriver driver,String name)
	{
		FN.sendKeys(name);
		UtilityNopcommerce.wait(driver, 1000);	
	}
	public void Reglast(WebDriver driver,String last)
	{
	LN.sendKeys(last);
	UtilityNopcommerce.wait(driver, 1000);
	}
	public void Regmail(WebDriver driver,String mail)
	{
		Mail.sendKeys(mail);
		UtilityNopcommerce.wait(driver, 1000);
	}
	public void Regpassword(WebDriver driver,String Password) 
	{
		
		password.sendKeys("Password");
		UtilityNopcommerce.wait(driver, 1000);
	}
	public void RegConfirmPassword(WebDriver driver,String ConfirmP)
	{
		confirmpassword.sendKeys("ConfirmP");
		UtilityNopcommerce.wait(driver, 1000);
	}
	
	
	
	
	
	
	
	
	
	public void Regdate(WebDriver driver,String date)
	
	{

		Select s=new Select(dob);
		
	}
	public void RegMonth(WebDriver driver,String month)
	{
		Select m=new Select(dom);
	}
	public void RegYear(WebDriver driver,String year)
	{
		Select y=new Select(doy);
	}
	public void regUser(WebDriver driver)
	{
		register.click();
	}
	
}
