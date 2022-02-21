package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExpWaitForAlert {
	
	static WebDriver driver;

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		
		 driver=new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		
		//acceptAlert(10);
		System.out.println(alertGetText(5));
		driver.switchTo().defaultContent();

	}
	
	public static Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void acceptAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();
	}
	
	public static String alertGetText(int timeOut) {
		Alert alert = waitForJSAlert(timeOut);
		String text = alert.getText();
		alert.accept();
		return text;
	}
	
	public static void alertSendKeys(int timeOut, String value) {
		waitForJSAlert(timeOut).sendKeys(value);
	}
	
	
	

}
