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

public class MultipleWindowsRahulShetty {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement fot=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]")); 
		
		List<WebElement> ls=fot.findElements(By.tagName("a"));
		int count=ls.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String clk=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			fot.findElements(By.tagName("a")).get(i).sendKeys(clk);
			
		}
			
		Set<String> s=driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(s);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
			{
			driver.switchTo().window(itr.next());
			
			String ti=driver.getTitle();
			System.out.println(ti);
			
			if(ti.equalsIgnoreCase("The World's Most Popular API Testing Tool | SoapUI"))
			{
				driver.findElement(By.xpath("//*[@id=\"form\"]/section[1]/div/div/div/div/div[1]/p[2]/a")).click();
			
			}
			
		}
		
	}	
}
