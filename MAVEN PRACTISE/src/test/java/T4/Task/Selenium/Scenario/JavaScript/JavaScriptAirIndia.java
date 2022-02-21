package T4.Task.Selenium.Scenario.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptAirIndia {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.airindia.in/");
		 // driver.manage().window().maximize();
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scrollBy(0,100)");
		  
		  WebElement from=driver.findElement(By.id("from"));
		  from.sendKeys("PU");
		  
		  JavascriptExecutor js1=(JavascriptExecutor)driver;
		  
		  String city="return document.getElementById(\"from\").value;";
		  
		  String cityop=(String) js1.executeScript(city);
		  System.out.println(cityop);
		  
		  while(!cityop.equalsIgnoreCase("Pune, Lohegaon Airport, PNQ, India"))
		  {
			  
			  from.sendKeys(Keys.DOWN);
			  Thread.sleep(1000);
			  
			  city="return document.getElementById(\"from\").value;";
			  cityop=(String) js1.executeScript(city);
			  System.out.println(cityop);
		  }
	
		  driver.findElement(By.id("from")).sendKeys(Keys.ENTER);
	
	
	
	
	}
}
