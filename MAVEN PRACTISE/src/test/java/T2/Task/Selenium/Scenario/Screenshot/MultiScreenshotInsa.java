package T2.Task.Selenium.Scenario.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class MultiScreenshotInsa {
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyToDirectory(src,new File("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\PRACTISE MAVEN"));
		
		MultiScreenShot ms=new MultiScreenShot("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\PRACTISE MAVEN\\Practise", " Insta");
		ms.multiScreenShot(driver);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("YOGESH12345");
		ms.multiScreenShot(driver);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("YOGESH12345");
		ms.multiScreenShot(driver);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
		ms.multiScreenShot(driver);
		
		File src1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyToDirectory(src1,new File("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\PRACTISE MAVEN"));
}
}