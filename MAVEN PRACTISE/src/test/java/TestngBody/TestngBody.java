package TestngBody;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBody {

	
	@BeforeSuite
	public void openBrowser()
	{
		driver.get();
	}
	
	@BeforeTest
	public void enterUrl()
	{
		
	}
	
	@BeforeClass
	public void TimemaxWindow()
	{
		
	}
	
	@BeforeMethod
	public void ScreenshotCookie()
	{
		
	}
	
	@Test
	public void name()
	{
		
	}
	@AfterMethod
	public void Screenshot()
	{
	System.out.println("Take a screen shot");	
	}
	
	@AfterClass
	public void cookieDelet()
	{
		
	}
	
	@AfterTest
	public void dbConnection()
	{
		
	}
	
	@AfterSuite
	public void Close()
	{
		
	}
	
	
}
