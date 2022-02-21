package T5.Task.Selenium.Scenario.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertChercherTech {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\TESTING REQUIRED APPS JARS\\Chrome 95 drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[1]")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[2]")).click();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[3]")).click();
		driver.switchTo().alert().sendKeys("NIHIT");
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		
	}
}