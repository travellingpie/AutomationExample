package WebdriverTestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	
	@Test
	public void testGoogleTitle() {
		System.setProperty("webdriver.chrome.driver", "/Users/tugbacetinkaya/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());		
		
	}
}
