package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	private WebDriver driver;

	public void initialize(final WebDriver webdriver) {
		this.driver = webdriver;

		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

}
