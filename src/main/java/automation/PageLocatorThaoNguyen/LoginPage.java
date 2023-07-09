package automation.PageLocatorThaoNguyen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LoginPage {
	private WebDriver driver;
	private By textemail = By.id("email");
	private By textpass = By.id("password");
	private By btnLogin= By.xpath("//button[@type='submit']");
	public LoginPage (WebDriver _driver){
		this.driver=_driver;
	}
	public void LoginFuntion(String email, String pass){
		//Nhập email
		WebElement txtemail= driver.findElement(textemail);
		if (txtemail.isDisplayed()) {
			txtemail.clear();
			txtemail.sendKeys(email);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		//Nhập pass
		WebElement txtpass= driver.findElement(textpass);
		if (txtpass.isDisplayed()) {
			txtpass.clear();
			txtpass.sendKeys(pass);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
				
		//click btnsubmit
		WebElement btnlogin= driver.findElement(btnLogin);
		if (btnlogin.isDisplayed()) {
			btnlogin.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		//Kiểm tra đăng nhập TC
//		WebElement dashboard= driver.findElement(DashboardPage.textDashboard);
//		assertTrue(dashboard.isDisplayed());
		
		//KT đăng nhập fail

	}
	
}
