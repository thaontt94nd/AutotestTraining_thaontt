package automation.testsuite.ThaoNguyen;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocatorThaoNguyen.loginPage_Factory;
import automation.PageLocatorThaoNguyen.Addclientfail;
import automation.PageLocatorThaoNguyen.Checkaddsucc;
import automation.PageLocatorThaoNguyen.ClientPage;
import automation.PageLocatorThaoNguyen.ClientPage_Factory;
import automation.PageLocatorThaoNguyen.Dashboard_Factory;
import automation.PageLocatorThaoNguyen.Addmultiplecontacts;
import automation.PageLocatorThaoNguyen.Logout;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class ClientTest_Factory  extends CommonBase {
	@BeforeTest
	public void openchromeDriver() {
		driver = initChromeDirvier(CT_Account.webURL);
	}
	
	@Test
	public void addclientSucess() {
		loginPage_Factory login = new loginPage_Factory(driver);
		login.LoginFuntion("admin@demo.com", "riseDemo");
		
		Dashboard_Factory dashboard = new Dashboard_Factory(driver);
		dashboard.dashboard.isDisplayed();
		
		dashboard.menuclients.click();
		
		ClientPage_Factory addclientSucess = new ClientPage_Factory(driver);
		addclientSucess.ClientFuntion("thaontt6", "ABC", "ABC", "ABC", "ABC", "ABC", "098", "ABC", "ABC", "ABC", "ABC");
		
		Checkaddsucc Checkadd = new Checkaddsucc(driver);
		Checkadd.Checkadd("thaontt6");
	}
	
	@Test
	public void addclient_nullcompany() {
		ClientPage_Factory addclient_nullcompany = new ClientPage_Factory(driver);
		addclient_nullcompany.ClientFuntion("", "ABC1", "ABC1", "ABC1", "ABC1", "ABC1", "098", "ABC1", "ABC1", "ABC1", "ABC1");
		WebElement addfail= driver.findElement(Addclientfail.txtERR_company);
		assertTrue(addfail.isDisplayed());
	}
	
	@AfterTest
	public void closechromeDriver() {
		quitDriver(driver);
	}
}
