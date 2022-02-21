package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownHandleWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		
		
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		selectDropDownWithoutSelect(country, "India");
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void selectDropDownWithoutSelect(By locator, String value) {

		List<WebElement> optionsList = getElements(locator);

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

}
