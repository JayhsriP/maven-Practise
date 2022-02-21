package D2.Task.Web.Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzWebTable {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.cricbuzz.com/live-cricket-scorecard/6043/ind-vs-pak-3rd-final-bangladesh-india-pakistan-in-bangladesh-1998");
		  
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement t=driver.findElement(By.xpath("//*[@id=\"innings_2\"]/div[1]"));
		
		List<WebElement>l=t.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"] :nth-child(3)"));
	
		int c=l.size();
		System.out.println(c);
		int sum=0;
		for(int i=0;i<c-2;i++)
		{
			String val=t.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"] :nth-child(3)")).get(i).getText();
			
			int value=Integer.parseInt(val);
			sum=sum+value;
			System.out.println(value);
		}
		System.out.println(sum);
	}
}
