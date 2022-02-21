package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestId {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/main/index.html");
		String text = driver.findElement(By.id("test")).getText();
		System.out.println(text);
		
	}

}
