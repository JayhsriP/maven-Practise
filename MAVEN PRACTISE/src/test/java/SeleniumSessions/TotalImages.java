package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TotalImages {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//total images on the page
		//for each image, print src and alt value
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING REQUIRED APPS JARS\\Chrome 96 drivers\\chromedriver.exe");
		
		 driver=new ChromeDriver();

		
		driver.get("https://www.amazon.in/");
		
//		List<WebElement> imageList = driver.findElements(By.tagName("img"));
//		
//		System.out.println("total images: " + imageList.size());
//		
//		for(int i=0; i<imageList.size(); i++) {
//			String altValue = imageList.get(i).getAttribute("alt");
//			String srcValue = imageList.get(i).getAttribute("src");
//			
//			System.out.println(altValue + " : " + srcValue);
//
//		}
		
		//total links on the page, and print its text and href value
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("total links: " + linksList.size());
		
		for(WebElement e : linksList) {
			String hrefVal = e.getAttribute("href");
			String text = e.getText();
			System.out.println(hrefVal + ":" + text);
		}
		
	}

}
