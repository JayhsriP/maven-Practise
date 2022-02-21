package T4.Task.Selenium.Scenario.JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAirIndia1 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.airindia.in/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scrollBy(0,300)");
	  
	 WebElement src= driver.findElement(By.id("from"));
	 src.sendKeys("PU");
	 
	 JavascriptExecutor js1=(JavascriptExecutor)driver;
	 String city="return document.getElementById(\"from\").value;";
	 
	 String cityname=(String) js1.executeScript(city);
	 
	System.out.println(cityname);
	
	while(!cityname.equalsIgnoreCase("Pune, Lohegaon Airport, PNQ, India"))
	{
		src.sendKeys(Keys.DOWN);
		city="return document.getElementById(\"from\").value;";
		cityname=(String) js1.executeScript(city);
		System.out.println(cityname);
	}
	driver.findElement(By.id("from")).sendKeys(Keys.ENTER);
	
	
	}
}