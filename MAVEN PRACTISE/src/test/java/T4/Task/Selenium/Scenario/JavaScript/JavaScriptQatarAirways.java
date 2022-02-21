package T4.Task.Selenium.Scenario.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptQatarAirways {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.qatarairways.com/en-id/homepage.html");
		 // driver.manage().window().maximize();
		  
	
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scrollBy(0,300)");
		  
		  WebElement from=driver.findElement(By.id("bw-from"));
		  from.sendKeys("Pu");
	
		  JavascriptExecutor js1=(JavascriptExecutor)driver;
		  
		  String city="return document.getElementById(\"bw-from\").value;";
		  			    
		  
		  String cityn=(String) js1.executeScript(city);
		  System.out.println(cityn);
		  while(!cityn.equals("Pullman Moscow ID - Pullman Moscow ID Airport(PUW) - United States of America"))
		  {
			  from.sendKeys(Keys.DOWN);
			  city="return document.getElementById(\"bw-from\").value;";
			  cityn=(String) js1.executeScript(city);
			  System.out.println(cityn);
		  }
		  driver.findElement(By.id("bw-from")).sendKeys(Keys.ENTER);
		  
		  
		  
	}
	
}
