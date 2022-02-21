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

public class MultiScreenshotFacebook {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		MultiScreenShot ms=new MultiScreenShot("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\PRACTISE MAVEN\\Practise", " FB");
		ms.multiScreenShot(driver);
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyToDirectory(src, new File ("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\PRACTISE MAVEN\\HOME.png"));
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("YOGESH123");
		ms.multiScreenShot(driver);
		//File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scr1, new File("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\PRACTISE MAVEN\\Homepage.png"));
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("YOGESH123");
		ms.multiScreenShot(driver);
	}
}
