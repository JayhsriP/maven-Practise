package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 

public class WDMConcept {

	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.amazon.com");
//		System.out.println(driver.getTitle());
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		
		 

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		
		
		
	}

}
