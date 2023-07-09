package automation.PageLocatorThaoNguyen;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_Factory {
	private WebDriver driver;
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSubmit;
	
//	@FindBy(xpath="//div[normalize-space()='Authentication failed!']")
//	public static By authenErr1;
	
	
	public loginPage_Factory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFuntion (String email, String password) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtPass.clear();
		txtPass.sendKeys(password);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		btnSubmit.click();
	}
	
}
