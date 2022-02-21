package D3.Task.Wait.Concept;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import multiScreenShot.MultiScreenShot;

public class WaitConcept {

	 WebDriver driver;
	@BeforeSuite
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void enterUrl()
	{
		  driver.get("https://www.airindia.in/");
	}
	
	@BeforeClass
	public void TimemaxWindow()
	{
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"reg_email_confirmation__\"]"))).sendKeys("abc");
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"reg_email_confirmation__\"]"))).sendKeys("pqr");
	}
	
	@BeforeMethod
	public void ScreenshotCookie()
	{
		Set<Cookie> c=driver.manage().getCookies();
		for (Cookie co:c) 
		{
		System.out.println("COOKIE NAME  : "+co.getName());	
		}
	}
	
	@Test
	public void name()
	{
		Wait<WebDriver>w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
	}
	@AfterMethod
	public void MultiScreenshot() throws IOException
	{
		MultiScreenShot sc=new MultiScreenShot("D:\\TESTING REQUIRED APPS JARS\\FILES\\SCREENSHOTS", "multiscreenshot");
		sc.multiScreenShot(driver);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyToDirectory(src,new File("D:\\TESTING REQUIRED APPS JARS\\FILES\\SCREENSHOTS"));
		
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
