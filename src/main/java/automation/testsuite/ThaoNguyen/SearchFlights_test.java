package automation.testsuite.ThaoNguyen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocatorThaoNguyen.Search_Flights;
import automation.common.CommonBase;

public class SearchFlights_test extends CommonBase {
	@BeforeTest
	public void openSystemUnderTest() {
		driver = initChromeDriver("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
	}
	@Test
	public void Search_oneway() {
		Search_Flights search = new Search_Flights(driver);
		search.Search_oneway("England", "paris", "20072023");
		
		WebElement Search_Result = driver.findElement(
				By.xpath("//h2[@class='sec__title text-white']"));
		Search_Result.isDisplayed();
	}
	
	@Test
	public void Search_roundtrip() {
		Search_Flights search = new Search_Flights(driver);
		search.Search_roundtrip("England", "paris", "21072023-30072023");
		
		WebElement Search_Result = driver.findElement(
				By.xpath("//h2[@class='sec__title text-white']"));
		Search_Result.isDisplayed();
	}
	@AfterTest
	public void closeBrowTest() {
//		quitDriver(driver);
	}
}
