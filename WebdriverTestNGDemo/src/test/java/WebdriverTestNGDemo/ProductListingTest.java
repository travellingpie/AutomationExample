package WebdriverTestNGDemo;

import org.testng.annotations.Test;

import data.LoginData;
import page.ProductListingPage;

public class ProductListingTest extends BaseTest {
	private ProductListingPage productListingPage;
	private static final String FILE_PATH = "login/login.csv";

	@Override
	public void initialize() {
		productListingPage = createInstance(ProductListingPage.class);
	}

	@Test(testName = "TC-1")
	public void testSearchKey() {
		productListingPage.goTo().enterSearchKey("ceket").submitSearch();
	}

	@Test(testName = "TC-2")
	public void testLoadMore() {
		productListingPage.goTo().clickLoadMore();
	}

	@Test(testName = "TC-3")
	public void chooseProduct() {
		productListingPage.goTo().chooseProduct("size_50/6n");
	}

	public Object[][] processCsv(String csvFilePath, String testCaseId) {

		return null;
	}
}
