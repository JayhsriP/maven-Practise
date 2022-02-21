package T4.Task.Selenium.Scenario.JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qatar {
	
	

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 98 drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.qatarairways.com/en-us/homepage.html");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scrollBy (0,200)");
	  WebElement web=driver.findElement(By.id("bw-from"));
	  
	  web.sendKeys("Sy");
	  
	  JavascriptExecutor js1=(JavascriptExecutor)driver;
	  
	  String city="return document.getElementById(\"bw-from\").value;";
	  
	  String city1=(String) js1.executeScript(city);
	  System.out.println(city1);
	  while(!city1.equalsIgnoreCase("Sydney - J.A. Douglas McCurdy Airport(YQY) - Canada"))
	  {
		  web.sendKeys(Keys.DOWN);
		  city="return document.getElementById(\"bw-from\").value;";
		  city1=(String) js1.executeScript(city);
		  System.out.println(city1);
	  }
	  driver.findElement(By.id("bw-from")).sendKeys(Keys.ENTER);
	
	  
	  
}
}