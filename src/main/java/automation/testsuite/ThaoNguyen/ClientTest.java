package automation.testsuite.ThaoNguyen;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocatorThaoNguyen.loginPage_Factory;
import automation.PageLocatorThaoNguyen.Addclientfail;
import automation.PageLocatorThaoNguyen.ClientPage;
import automation.PageLocatorThaoNguyen.DashboardPage;
import automation.PageLocatorThaoNguyen.Loginfail;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class ClientTest extends CommonBase {
	@BeforeTest
	public void openchromeDriver() {
		driver = initChromeDirvier(CT_Account.webURL);
	}
	
	@Test
	public void addclient() {
		loginPage_Factory login = new loginPage_Factory(driver);
		login.LoginFuntion("admin@demo.com", "riseDemo");
		
		WebElement menuclient= driver.findElement(DashboardPage.menuclient);
		menuclient.click();
		
		WebElement addclient= driver.findElement(ClientPage.addclient);
		addclient.click();
	}
	@Test
	public void addclientSucess() {
		ClientPage addclientSucess = new ClientPage(driver);
		addclientSucess.ClientFuntion("", "ABC", "ABC", "ABC", "ABC", "ABC", "098", "ABC", "ABC", "ABC", "ABC");
	}
	
	@Test
	public void addclient_nullcompany() {
		loginPage_Factory login = new loginPage_Factory(driver);
		login.LoginFuntion("admin@demo.com", "riseDemo");
		
		WebElement menuclient= driver.findElement(DashboardPage.menuclient);
		menuclient.click();
		
		WebElement addclient= driver.findElement(ClientPage.addclient);
		addclient.click();
		
		ClientPage addclient_nullcompany = new ClientPage(driver);
		addclient_nullcompany.ClientFuntion("", "ABC", "ABC", "ABC", "ABC", "ABC", "098", "ABC", "ABC", "ABC", "ABC");
		WebElement addfail= driver.findElement(Addclientfail.txtERR_company);
		assertTrue(addfail.isDisplayed());
	}
	@AfterTest
	public void closechromeDriver() {
		quitDriver(driver);
	}
	
}
