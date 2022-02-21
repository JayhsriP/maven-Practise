package T3.Task.Selenium.Scenario.Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 98 drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("onward_cal")).click();
	  
	  while(!driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText().contains("Aug 2022"))
	  {
		  System.out.println("IN LOOP");
		  driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
	  }
	  
	  System.out.println("LOOP END");
	  
	  List<WebElement>ls=driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));
	  int co=ls.size();
	  System.out.println(co);
	  
	  for(int i=0;i<co;i++)
	  {
		  
		  
		  String s=driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td")).get(i).getText();
		  if(s.equalsIgnoreCase("20"))
		  {
			  driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td")).get(i).click();
			  break;
		  }
		  
	  }
}

}
