package T3.Task.Selenium.Scenario.Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandlingDemoAutomationBySelect {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");

		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker2")).click();
		
	WebElement month=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]"));
	Select sel=new Select(month);
	sel.selectByValue("3/2022");
		
		
		List<WebElement> l=driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td/a"));
		int co=l.size();
		
		for(int i=0;i<co;i++)
		{
			String day=driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td/a")).get(i).getText();
			
			if(day.equalsIgnoreCase("14"))
					{
				driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td/a")).get(i).click();
				break;
					}
			
		}
	}
}
