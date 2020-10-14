package pom;

import org.openqa.selenium.WebDriver;

import testRunner.TestRunner;


public class PageObjectManager {
	
	public static WebDriver driver=TestRunner.driver;
	private static ProductSearch pm;
	private PageObjectManager() {
		
	}
	
	public static ProductSearch getPs() {
		if(pm==null)
			pm=new ProductSearch(driver);
		return pm;
	}
}
