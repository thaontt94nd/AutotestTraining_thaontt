package automation.testsuite.ThaoNguyen;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.PageLocatorThaoNguyen.viewproject;
public class Testproject extends CommonBase {
//	@BeforeTest
//	@Parameters ("browser")
//	public void initDriver(String browser) {
//		setupDriver(browser);
//		driver.get("https://rise.fairsketch.com/signin");
//	}
	@BeforeTest
	public void initDriverTest() {
		driver =initChromeDriver();
		driver.get("https://rise.fairsketch.com/signin");
	}
	
	@Test
	public void findfilter() {
		viewproject findfilter = new viewproject(driver);
		findfilter.login();
		findfilter.menuproject();
		findfilter.checkSearchTableByColumn(7,"Completed");
	}
	
	@AfterTest
	public void alertclose() {
//		quitDriver(driver);
	}
	
}
