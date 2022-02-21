package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImpWaitForNonWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println(driver.getTitle());
		
		//alerts, title, urls -- with imp wait --- not applicable
		
	}

}
