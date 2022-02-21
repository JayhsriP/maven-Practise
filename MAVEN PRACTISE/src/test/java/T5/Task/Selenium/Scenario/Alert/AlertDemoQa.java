package T5.Task.Selenium.Scenario.Alert;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertDemoQa {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	driver.switchTo().alert().accept();
	
	Thread.sleep(1000);
	driver.findElement(By.id("timerAlertButton")).click();
	Thread.sleep(6000);
	//ACCEPT POP-UP
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("confirmButton")).click();
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.id("promtButton")).click();
	
	String s=driver.switchTo().alert().getText();
	System.out.println(s);
	
	driver.switchTo().alert().sendKeys("YOG");
	driver.switchTo().alert().accept();
}
}