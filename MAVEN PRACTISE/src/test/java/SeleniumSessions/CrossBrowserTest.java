package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "ie";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\TESTING REQUIRED APPS JARS\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the right browser..." + browser);
		}

		driver.get("http://www.google.com");// NPE

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
