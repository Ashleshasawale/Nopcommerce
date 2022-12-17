package testclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import nopcommerceBASENUtility.UtilityNopcommerce;


public class BaseClassCommerce {

	 protected WebDriver driver;
	 
	public void NopcommerceLaunch() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","G:\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityNopcommerce.readfromproperty("url"));
		//Reporter.log("launching the browser");
		
	}
	
	
	
	
	public void closebrowser()
	{
		driver.close();
		UtilityNopcommerce.wait(driver, 500);
		//Reporter.log("closing the browser");
	}
	
}
