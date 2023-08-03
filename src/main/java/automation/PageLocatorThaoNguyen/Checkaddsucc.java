package automation.PageLocatorThaoNguyen;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkaddsucc {
	private WebDriver driver;
	@FindBy(xpath="//span[text()='Total clients']")
	private WebElement totalClientCard;
	
	@FindBy(xpath="//a[normalize-space()='Demo Client']")
	private WebElement value1;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement btnsearch;
	
	@FindBy(xpath="//a[normalize-space()='thaontt6']")
	public static WebElement searchResult;
	
	public Checkaddsucc (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void Checkadd (String company_name ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", totalClientCard);
		js.executeScript("window.stop();");
//		assertTrue(value1.isDisplayed());
		btnsearch.click();
		btnsearch.sendKeys(company_name);
//		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		assertTrue(searchResult.isDisplayed());
	}
}
