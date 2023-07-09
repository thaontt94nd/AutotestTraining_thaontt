package automation.testsuite.ThaoNguyen;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocatorThaoNguyen.DashboardPage;
import automation.PageLocatorThaoNguyen.loginPage_Factory;
import automation.common.CommonBase;
import automation.PageLocatorThaoNguyen.Loginfail;
import automation.constant.CT_Account;

public class LoginPage_day14 extends CommonBase {
	WebDriver driver;
	@BeforeTest
	public void openchromeDriver() {
		driver = initChromeDirvier(CT_Account.webURL);
	}
	@Test
	public void Loginsucessfully() {
		loginPage_Factory login = new loginPage_Factory(driver);
		login.LoginFuntion("admin@demo.com", "riseDemo");
		WebElement dashboard= driver.findElement(DashboardPage.textDashboard);
		assertTrue(dashboard.isDisplayed());
	}
	@Test
	public void Loginfail() {
		loginPage_Factory login = new loginPage_Factory(driver);
		login.LoginFuntion("admin1@demo.com", "riseDemo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement loginfail= driver.findElement(Loginfail.textErr);
		assertTrue(loginfail.isDisplayed());
	}
	@AfterTest
	public void closechromeDriver() {
		quitDriver(driver);
	}
}
