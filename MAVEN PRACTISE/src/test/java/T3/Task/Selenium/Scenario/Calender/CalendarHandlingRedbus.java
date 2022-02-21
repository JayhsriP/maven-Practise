package T3.Task.Selenium.Scenario.Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandlingRedbus {
	
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","D:\\TESTING REQUIRED APPS JARS\\Chrome 95 drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
	while(!driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText().equals("Jun 2022"))
	{
		
		System.out.println("IN LOOP");
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
	}
	System.out.println("LOOP END");
	
	List<WebElement> l=driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));
	
	int n=l.size();
	for(int i=0;i<n;i++)
	{
		String day=driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td")).get(i).getText();
		
		if(day.equalsIgnoreCase("6"))
		{
			driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td")).get(i).click();
			break;
		}
	}
}
}