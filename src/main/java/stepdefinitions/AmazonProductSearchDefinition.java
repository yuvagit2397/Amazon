package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.runner.Runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.BaseClass;
import pom.PageObjectManager;
import pom.ProductSearch;
import propertyFile.FileReaderManager;
import testRunner.TestRunner;

public class AmazonProductSearchDefinition extends BaseClass {
	public static WebDriver driver=TestRunner.driver;
			
	//PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("user is on amazon search page")
	public void user_is_on_amazon_search_page() throws IOException {
		String url = FileReaderManager.getConfiqInstance().getUrl();
		driver.get(url);
	}
	

	@Given("user enters searchterm {string}")
	public void user_enters_searchterm(String searchItem) {
		PageObjectManager.getPs().searchBooox.sendKeys(searchItem+Keys.ENTER);
	}

	

	@Then("user get the name and price of the products")
	public void user_get_the_name_and_price_of_the_cart_products() {
		String mobName="Apple iPhone 6s (128GB) - Space Grey";
		List<WebElement> mobileNames = PageObjectManager.getPs().mobileNames;
		for (WebElement allMobiles : mobileNames) {
			//System.out.println(allMobiles.getText());
			if(allMobiles.getText().equals(mobName)) {
				WebElement rate = driver.findElement(By.xpath("//span[text()='"+mobName+"']/following::a[3]/span/span/span[2]"));
				String text = rate.getText();
				System.out.println("MoblieName ="+mobName);
				System.out.println("price rupees "+text);
			}
			
		}
	}
}
