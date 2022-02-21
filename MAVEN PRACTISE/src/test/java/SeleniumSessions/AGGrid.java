package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AGGrid {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();

		driver.get("https://www.ag-grid.com/");
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//div[text()='Sophie Beckham']/preceding-sibling::div//input")).click();
//		
//		driver.findElements(By.xpath("//div[text()='Sophie Beckham']//following-sibling::div")).forEach(e -> System.out.println(e.getText()));
		
		//driver.findElements(By.xpath("//span[text()='Wool']/../../../div[@role='gridcell']")).forEach(e -> System.out.println(e.getText()));
		driver.findElements(By.xpath("//div[text()='Cobalt']//following-sibling::div")).forEach(e -> System.out.println(e.getText()));
	}

}
