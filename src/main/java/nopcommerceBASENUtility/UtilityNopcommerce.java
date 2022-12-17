package nopcommerceBASENUtility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;




public class UtilityNopcommerce {

	
	//ss,properrty file,wait
	public static  String readfromproperty( String key) throws IOException
	{
		
		Properties p=new Properties();
		FileInputStream myfile= new FileInputStream("C:\\Users\\rf pune new\\eclipse-workspace\\selenium\\nopcommerceP.properties");
	
		p.load(myfile);
		  String keyvalue = p.getProperty(key);
		return keyvalue;
	
	}
	
public static void Screenshot(WebDriver driver, String FileName) throws IOException
	
	{
		//String a=RandomString.make(2);
	
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  String datetime = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date(0));
	File dest = new File("C:\\Users\\rf pune new\\Desktop\\material\\AUTOMATION NOTES\\screenshots\\"+datetime);
	
	FileHandler.copy(src, dest);
	//Reporter.log("Screenshot taken",true);
	
	}
public static void wait(WebDriver driver,int waittime)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
	//Reporter.log("waitingtime"+waittime+"milis",true);
}

}
