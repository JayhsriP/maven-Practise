package T1.Task.Selenium.Scenario.MultiWindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowSpring3 {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://spring.io/");
		 // driver.manage().window().maximize();
	
		  WebElement footer=driver.findElement(By.xpath("//*[@id=\"footer-over\"]/div/div[1]/div/div[4]"));
		  
		  List<WebElement> ls=footer.findElements(By.tagName("a"));
		  
		 int count= ls.size();
		 System.out.println(count);
		 
		 for(int i=0;i<count;i++)
		 {
			 String clk=Keys.chord(Keys.CONTROL,Keys.ENTER);
			 footer.findElements(By.tagName("a")).get(i).sendKeys(clk);
		 }
		 	Set<String> s=driver.getWindowHandles();
		 	ArrayList<String>al=new ArrayList<String>(s);
		 	
		 	Iterator<String>itr=al.iterator();
		 	while(itr.hasNext())
		 	{
		 		driver.switchTo().window(itr.next());	
		 		String ti=driver.getTitle();
		 		Thread.sleep(2000);
		 		if(ti.equalsIgnoreCase("Spring | VMware Spring Runtime"))
		 		{
		 			driver.findElement(By.xpath("//*[@id=\"nav-items\"]/li[4]/a")).click();
		 		}
		 	}
		 	driver.close();
}
}
