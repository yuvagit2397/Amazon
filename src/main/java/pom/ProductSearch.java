package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch {
	public static WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public static WebElement getSearchBooox() {
		return searchBooox;
	}

	public static List<WebElement> getMobileNames() {
		return mobileNames;
	}

	public static List<WebElement> getMobilePrices() {
		return mobilePrices;
	}

	@FindBy(id = "twotabsearchtextbox")
	public static WebElement searchBooox;

	@FindBy(xpath = "//a[@class='a-link-normal a-text-normal']/span")
	public static List<WebElement> mobileNames;

	@FindBy(xpath = "//span[@class='a-price']/span[1]")
	public static List<WebElement> mobilePrices;

	public ProductSearch(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

}
