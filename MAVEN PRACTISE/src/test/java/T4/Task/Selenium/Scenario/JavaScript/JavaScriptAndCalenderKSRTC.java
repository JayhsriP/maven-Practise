package T4.Task.Selenium.Scenario.JavaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAndCalenderKSRTC {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://ksrtc.in/oprs-web/");
		  driver.manage().window().maximize();
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scrollBy(0,300)");
		  
		  System.out.println("====================================================");
		  System.out.println("================= ENTER SOURCE CITY =================");
		  System.out.println("====================================================");
		  WebElement from=driver.findElement(By.id("fromPlaceName"));
		  from.sendKeys("ban");
		  
		  JavascriptExecutor js1=(JavascriptExecutor)driver;
		  
		  String city="return document.getElementById(\"fromPlaceName\").value;";
		  
		  String cityn=(String) js1.executeScript(city);
		  System.out.println(cityn);
		  while(!cityn.equalsIgnoreCase("BANGALORE AIRPORT"))
		  {
			  Thread.sleep(1000);
			  from.sendKeys(Keys.DOWN);
			  
			  city="return document.getElementById(\"fromPlaceName\").value;";
			  cityn=(String) js1.executeScript(city);
			  System.out.println(cityn);
		  }
		  driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
				 
		  
		  System.out.println("====================================================");
		  System.out.println("============== ENTER DESTINATION CITY ==============");
		  System.out.println("====================================================");
		  WebElement dest=driver.findElement(By.id("toPlaceName"));
		  dest.sendKeys("ch");
		  
		  JavascriptExecutor js2=(JavascriptExecutor)driver;
		  
		  String city2="return document.getElementById(\"toPlaceName\").value;";
		  String cityn2=(String) js2.executeScript(city2);
		  System.out.println(cityn2);
		  
		  while(!cityn2.equalsIgnoreCase("CHIKKABALLAPURA"))
		  {
			  Thread.sleep(1000);
			  dest.sendKeys(Keys.DOWN);
			  city2="return document.getElementById(\"toPlaceName\").value;";
			  cityn2=(String) js2.executeScript(city2);
			  System.out.println(cityn2);
		  }
		  driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
		  
		  System.out.println("====================================================");
		  System.out.println("============== SELECT DEPARTURE DATE ==============");
		  System.out.println("====================================================");
		  
		 driver.findElement(By.id("txtJourneyDate")).click();
		 
		 while(!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText().equals("January"))
		 {
			System.out.println("IN LOOP");
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		 }
		 
		 System.out.println("LOOP END");
		 
		 List<WebElement> l=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
		 
		 int c=l.size();
		 System.out.println(c);
		 
		 for(int i=0;i<c;i++){
			 {
				 String day=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")).get(i).getText();
				 
				 if(day.equalsIgnoreCase("30"))
				 {
					 driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")).get(i).click();
					 break;
					 
				 }
				 
			 }
		 }
		 
		  System.out.println("====================================================");
		  System.out.println("================ SELECT RETURN DATE ================");
		  System.out.println("====================================================");
		  
		  driver.findElement(By.id("txtReturnJourneyDate")).click();
		  
		  while(!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText().equals("February"))
		  {
			  System.out.println("IN LOOP");
			  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		  }
		  System.out.println("LOOP END");
		  
		  
		  List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
		  int co=ls.size();
		  System.out.println(co);
		  
		  for(int i=0;i<co;i++)
		  {
			  String rday=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")).get(i).getText();
			  
			  if(rday.equalsIgnoreCase("16"))
			  {
				  driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")).get(i).click();
				  break;
			  }
		  }
	}
}