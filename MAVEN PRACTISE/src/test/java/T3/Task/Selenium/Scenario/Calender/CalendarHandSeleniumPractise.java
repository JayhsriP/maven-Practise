package T3.Task.Selenium.Scenario.Calender;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandSeleniumPractise {

public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		  driver.manage().window().maximize();
		  
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\SeleniumPractise\\Start.png"));
		  
		  driver.findElement(By.id("datepicker")).click();
		  
		  while(!driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText().contains("June"))
		  {
			  System.out.println("IN LOOP");
			 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click(); 
		  }  
		  System.out.println("LOOP END");
		  
		  List<WebElement> l=driver.findElements(By.xpath("//a[@class=\"ui-state-default\"]"));
		  int c=l.size();
		  System.out.println(c);
		  
		  for(int i=0;i<c;i++)
		  {
			  String s=driver.findElements(By.xpath("//a[@class=\"ui-state-default\"]")).get(i).getText();
			  
			  if(s.equalsIgnoreCase("6"))
			  {
				  driver.findElements(By.xpath("//a[@class=\"ui-state-default\"]")).get(i).click();
			  }
		  }
		  
		  File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src1, new File("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\SeleniumPractise\\End.png"));
		  
	}
}
