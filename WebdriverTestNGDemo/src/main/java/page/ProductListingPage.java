package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class ProductListingPage extends BasePage {
	
	@FindBy(id = "search")
	private WebElement searchBox;
	
	@FindBy(xpath="//a[@class='button -secondary -sm relative' and contains(text(), 'Daha fazla göster')]")
	private WebElement btnLoadMore; 
	
	private WebElement anyProduct;
	
	@FindBy(id = "user-name")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login-button")
	private WebElement btnLogin;
	

	public ProductListingPage goTo() {
		System.setProperty("webdriver.chrome.driver", "/Users/tugbacetinkaya/Downloads/chromedriver");
		//config olarak eklemek daha mantikli
		getDriver().get("https://www.network.com.tr/");

		return this;
	}

	public ProductListingPage enterUsername(final String username) {
		txtUsername.clear();
		txtUsername.sendKeys(username);

		return this;
	}

	public ProductListingPage enterPassword(final String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);

		return this;
	}
	public ProductListingPage enterSearchKey(final String searchKey) {
		searchBox.clear();
		searchBox.sendKeys(searchKey);

		return this;
	}
	

	public String getErrorMessage() {
		return getDriver().findElement(By.className("error-message-container")).findElement(By.tagName("h3")).getText();
	}

	public void clickLogin() {
		btnLogin.click();
	} 
	public void clickLoadMore() {
		btnLoadMore.click();
	} 
	public void chooseProduct(String size) {
		List<WebElement> elements = anyProduct.findElements(By.cssSelector("wis-discount-container"));
		WebElement elk = elements.get(0);
		elk.findElement(By.id(size)).click();
	} 
	public void submitSearch() {
		searchBox.submit();
	} 
}

