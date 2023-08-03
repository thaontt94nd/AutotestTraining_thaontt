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
		driver = initChromeDriver(CT_Account.webURL);
	}
	
	@Test(priority=1)
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
	
	@Test(priority=5)
	public void addclient_nullcompany() {
		Logout Logout = new Logout(driver);
		Logout.logout();
		
		loginPage_Factory login = new loginPage_Factory(driver);
		login.LoginFuntion("admin@demo.com", "riseDemo");
		
		Dashboard_Factory dashboard = new Dashboard_Factory(driver);
		dashboard.menuclients.click();
		
		ClientPage_Factory addclient_nullcompany = new ClientPage_Factory(driver);
		addclient_nullcompany.ClientFuntion("", "ABC1", "ABC1", "ABC1", "ABC1", "ABC1", "098", "ABC1", "ABC1", "ABC1", "ABC1");
		WebElement addfail= driver.findElement(Addclientfail.txtERR_company);
		assertTrue(addfail.isDisplayed());
		ClientPage_Factory closeadd = new ClientPage_Factory(driver);
		closeadd.btnclose2.click();
	}
	@Test(priority=2)
	public void addclient_btnclose() {
				ClientPage_Factory addclient_btnclose = new ClientPage_Factory(driver);
		addclient_btnclose.ClientFuntion1("thaontt7", "ABC1", "ABC1", "ABC1", "ABC1", "ABC1", "098", "ABC1", "ABC1", "ABC1", "ABC1");
		Checkaddsucc Checkadd = new Checkaddsucc(driver);
		Checkadd.searchResult.isDisplayed();
	}
	
	@Test(priority=3)
	public void addclient_btnsave_close() {
		ClientPage_Factory addclient_btnsave_continue = new ClientPage_Factory(driver);
		addclient_btnsave_continue.ClientFuntion2("thaontt8", "ABC1", "ABC1", "ABC1", "ABC1", "ABC1", "098", "ABC1", "ABC1", "ABC1", "ABC1");
		
		Addmultiplecontacts btnSaveandmore = new Addmultiplecontacts(driver);
		btnSaveandmore.AddmultiplecontactsFuntion1("jisso1", "Nguyen", "nguyenjisso@gmail.com", "1","1", "1", "123456");

		Checkaddsucc Checkadd = new Checkaddsucc(driver);
		Checkadd.searchResult.isDisplayed();
	}
	
	@Test(priority=4)
	public void addclient_btnsave_continue() {
		ClientPage_Factory addclient_btnsave_continue = new ClientPage_Factory(driver);
		addclient_btnsave_continue.ClientFuntion2("thaontt9", "ABC1", "ABC1", "ABC1", "ABC1", "ABC1", "098", "ABC1", "ABC1", "ABC1", "ABC1");
		
		Addmultiplecontacts btnSaveandmore = new Addmultiplecontacts(driver);
		btnSaveandmore.AddmultiplecontactsFuntion("lisa", "Nguyen", "lisa@gmail.com", "1", "1","1", "123456");
		
		Logout Logout = new Logout(driver);
		Logout.logout();
		
		loginPage_Factory login = new loginPage_Factory(driver);
		login.LoginFuntion("lisa@gmail.com", "123456");
		
		Dashboard_Factory dashboard = new Dashboard_Factory(driver);
		dashboard.dashboard.isDisplayed();
	}
	
	@AfterTest
	public void closechromeDriver() {
		quitDriver(driver);
	}
}
