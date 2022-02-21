package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AuthPopHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();

		
		driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

		//CDP - later
		
	}

}
