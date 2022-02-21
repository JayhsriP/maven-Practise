package T4.Task.Selenium.Scenario.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSingporeair {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		 // driver.manage().window().maximize();
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scrollBy(0,300)");
		  
		  WebElement src=driver.findElement(By.id("flightOrigin1"));
		  src.clear();
		  
		  src.sendKeys("sp");
		  
		  JavascriptExecutor js1=(JavascriptExecutor)driver;
		  
		  String city="return document.getElementById(\"flightOrigin1\").value;";
		  
		  String cityname=(String) js1.executeScript(city);
		  System.out.println(cityname);
		  while(!cityname.equals("Colorado Springs - COS"))
		  {
			  src.sendKeys(Keys.DOWN);
			  city="return document.getElementById(\"flightOrigin1\").value;";
			  cityname=(String) js1.executeScript(city);
			  System.out.println(cityname);
		  }
		  driver.findElement(By.id("flightOrigin1")).sendKeys(Keys.ENTER);
		  
		  WebElement dest=driver.findElement(By.id("bookFlightDestination"));
		  dest.sendKeys("sp");
		  
		  JavascriptExecutor js2=(JavascriptExecutor)driver;
		  
		  String dcity="return document.getElementById(\"bookFlightDestination\").value;";
		  
		  String dcityname=(String) js2.executeScript(dcity);
		  System.out.println(dcityname);
		  while(!dcityname.equals("Palm Springs - PSP"))
		  {
			  dest.sendKeys(Keys.DOWN);
			  dcity="return document.getElementById(\"bookFlightDestination\").value;";
			  dcityname=(String) js2.executeScript(dcity);
			  System.out.println(dcityname);
		  }
		  driver.findElement(By.id("bookFlightDestination")).sendKeys(Keys.ENTER);
		  
}
}