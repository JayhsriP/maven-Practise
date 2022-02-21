package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



//sel 3
public class RWDTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		
		

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("naveen");
		driver.findElementByName("q").sendKeys("automation");
		
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("http://www.google.com");
		
		
		
	}

}
