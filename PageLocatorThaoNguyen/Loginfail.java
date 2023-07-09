package automation.PageLocatorThaoNguyen;

import org.openqa.selenium.By;

public class Loginfail {
	public static By textErr = By.xpath("//div[normalize-space()='Authentication failed!']");
	public static By textErr_nullemail = By.xpath("//span[@id='email-error']");
	public static By textErr_nullpass = By.xpath("//span[@id='password-error']");
}
