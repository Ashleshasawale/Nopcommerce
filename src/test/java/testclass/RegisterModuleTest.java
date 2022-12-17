package testclass;

import java.io.IOException;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import nopcommerceBASENUtility.UtilityNopcommerce;
import nopcommercePOM.HomeNopcommerce;
import nopcommercePOM.Register;

@Listeners(listener.Listener.class)

public class RegisterModuleTest extends BaseClassCommerce

{
	HomeNopcommerce home;
	Register reg;
	
	@BeforeClass
	public void Launchapp() throws IOException
	{
		NopcommerceLaunch();
		home =new HomeNopcommerce(driver);
		reg=new Register(driver);
			
	}
	@BeforeMethod
	public void details() throws IOException, InterruptedException
	{
		home.clickonReg();
		
		reg.Regname(driver, UtilityNopcommerce.readfromproperty("username"));
		Thread.sleep(1000);
		
		reg.Reglast(driver, UtilityNopcommerce.readfromproperty("lastname"));
		Thread.sleep(1000);
		
		reg.Regmail(driver, UtilityNopcommerce.readfromproperty("email"));
		Thread.sleep(1000);
		
		reg.Regpassword(driver, UtilityNopcommerce.readfromproperty("password"));
		Thread.sleep(1000);
		
		reg.RegConfirmPassword(driver, UtilityNopcommerce.readfromproperty("cp"));
		Thread.sleep(1000);
	}
	
	
  @Test
  public void RegModule() 
  {
	  //Reporter.log("registration is done",true);
  }
@AfterMethod
  public void regis()
  {
	  reg.regUser(driver);
  }
 
}
