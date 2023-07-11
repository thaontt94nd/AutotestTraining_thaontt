package automation.PageLocatorThaoNguyen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class Dashboard_Factory {
	private WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Dashboard']")
	public static WebElement dashboard;
	
	@FindBy(xpath="//span[normalize-space()='Clients']")
	public static WebElement menuclients;
	
	public Dashboard_Factory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
