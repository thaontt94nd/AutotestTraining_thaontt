package automation.testsuite.ThaoNguyen;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.PageLocatorThaoNguyen.*;
public class LoginTest extends CommonBase {
	WebDriver driver;
	@BeforeTest
	public void openchromeDriver() {
		driver = initChromeDriver(CT_Account.webURL);
	}
	@Test
	public void Loginsucessfully() {
		LoginPage login = new LoginPage(driver);
		login.LoginFuntion("admin@demo.com", "riseDemo");
		WebElement dashboard= driver.findElement(DashboardPage.textDashboard);
		assertTrue(dashboard.isDisplayed());
	}
	@Test
	public void Loginfail() {
		LoginPage login1 = new LoginPage(driver);
		login1.LoginFuntion("admin1@demo.com", "riseDemo");
		WebElement loginfail= driver.findElement(Loginfail.textErr);
		assertTrue(loginfail.isDisplayed());
	}
	//Loginfail pass
	@Test
	public void Loginfailpass() {
		LoginPage login1 = new LoginPage(driver);
		login1.LoginFuntion("admin@demo.com", "riseDemo1");
		WebElement loginfail= driver.findElement(Loginfail.textErr);
		assertTrue(loginfail.isDisplayed());
	}
	
	//Loginfail null email
	@Test
	public void Loginfail_nullemail() {
		LoginPage login1 = new LoginPage(driver);
		login1.LoginFuntion("", "riseDemo");
		WebElement loginfail= driver.findElement(Loginfail.textErr_nullemail);
		assertTrue(loginfail.isDisplayed());
	}
	//Loginfail null pass
		@Test
		public void Loginfail_nullpass() {
			LoginPage login1 = new LoginPage(driver);
			login1.LoginFuntion("admin@demo.com", "");
			WebElement loginfail= driver.findElement(Loginfail.textErr_nullpass);
			assertTrue(loginfail.isDisplayed());
		}
	@AfterTest
	public void closechromeDriver() {
		quitDriver(driver);
	}
	
}
