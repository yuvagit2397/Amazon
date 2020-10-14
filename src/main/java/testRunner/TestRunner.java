package testRunner;

import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import propertyFile.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\yuvasri_revision\\AmazonMobilePhones\\src\\main\\java\\featureFiles\\AmazonProductSearch.feature", 
				glue = "stepdefinitions",strict=true,
				plugin = {"html:Reports/Iphones.html","json:Reportsjson/AmazonMobilePhonesJson.json"
			})
				
public class TestRunner {

	public static WebDriver driver;
	public static ExtentReports extentReports;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest testCases;
	@BeforeClass
	public static void setUp() throws IOException {
		String browserName = FileReaderManager.getConfiqInstance().getBrowserName();
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else {
			System.out.println("Give valid browser name");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extentReports=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter("Amazon.html");
		extentReports.attachReporter(htmlReporter);
	}

	@AfterClass
	public static void tearDown() {
	
		driver.quit();
		
		}
	}


