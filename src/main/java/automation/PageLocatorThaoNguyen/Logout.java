package automation.PageLocatorThaoNguyen;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	private WebDriver driver;
	@FindBy(id="user-dropdown")
	private WebElement  acc1;
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	private WebElement  logout;
	@FindBy(xpath="//h2[normalize-space()='Sign in']")
	private WebElement  login;
	
	
	public Logout (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void logout() {
		acc1.click();
		logout.click();
		assertTrue(login.isDisplayed());
		
	}
}
