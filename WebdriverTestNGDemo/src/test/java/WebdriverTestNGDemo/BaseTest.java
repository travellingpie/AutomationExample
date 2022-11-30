package WebdriverTestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import page.BasePage;

public abstract class BaseTest {
  private final WebDriver driver = new ChromeDriver();

  public abstract void initialize();

  protected <T extends BasePage> T createInstance(final Class<T> page) {
    return BasePageFactory.createInstance(driver, page);
  }


  @BeforeClass
  public void setup() {
	System.setProperty("webdriver.chrome.driver", "/Users/hakandemir/Downloads/chromedriver");
    initialize();
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}
