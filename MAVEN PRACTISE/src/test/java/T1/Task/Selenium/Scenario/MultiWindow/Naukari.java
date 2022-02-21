package T1.Task.Selenium.Scenario.MultiWindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	
	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 98 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.naukri.com/");
		  
		  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement footer=driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[1]/div/div/div[2]/ul"));
		  
		  List<WebElement> ls=footer.findElements(By.tagName("a"));
		  int co=ls.size();
		  System.out.println(co);
		  
		  for(int i=0;i<co-3;i++)
		  {
			  String clk=Keys.chord(Keys.CONTROL,Keys.ENTER);
			  footer.findElements(By.tagName("a")).get(i).sendKeys(clk);
		  }
		  
		  		Set<String>s=driver.getWindowHandles();
		  		
		  		ArrayList<String>al=new ArrayList<>(s);
		  		Iterator<String>itr=al.iterator();
		  		while(itr.hasNext())
		  		{
		  				driver.switchTo().window(itr.next());
		  				
		  				String ti=driver.getTitle();
		  				
		  				if(ti.equalsIgnoreCase("Info Edge (India) Limited"))
		  				{
		  					driver.findElement(By.xpath("/html/body/div[9]/div[1]/div[1]/div/div[2]/a")).click();
		  				}
		  		}
		  
}
}