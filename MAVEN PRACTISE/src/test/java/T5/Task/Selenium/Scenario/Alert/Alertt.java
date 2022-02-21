package T5.Task.Selenium.Scenario.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertt {

	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//WebDriverWait w=new WebDriverWait(driver, 10);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.className("username"))).sendKeys("user");
		
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.switchTo().alert().sendKeys("YOGESH");
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		
		
	}
}
