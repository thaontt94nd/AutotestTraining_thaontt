package automation.PageLocatorThaoNguyen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.common.CommonBase;

public class Search_Flights extends CommonBase {
	private WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='One way']")
	private WebElement rd_oneway;
	
	@FindBy(xpath="//a[@aria-controls='round-trip']")
	private WebElement rd_roundtrip;
	
	@FindBy(xpath="//a[normalize-space()='Multi-city']")
	private WebElement rd_multicity;
	
	@FindBy(xpath="//div[@id='one-way']/descendant::input[1]")
	private WebElement txtfrom_oneway;
	
	@FindBy(xpath="//div[@id='one-way']/descendant::input[2]")
	private WebElement txtto_oneway;
	
	@FindBy(xpath="//div[@id='one-way']/descendant::input[3]")
	private WebElement dateDeparting_oneway;
	
//	@FindBy(xpath="//div[@id='one-way']//div[@class='dropdown dropdown-contain gty-container']")
	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
	private WebElement cbPassengers_oneway;
	
	@FindBy(xpath="(//div[@id='one-way']//div[@class='qtyDec'])[1]")
	private WebElement DecAdults_oneway;
	
	@FindBy(xpath="(//div[@id='one-way']//div[@class='qtyInc'])[1]")
	private WebElement SumAdults_oneway;
	
	@FindBy(xpath="(//div[@id='one-way']//div[@class='qtyDec'])[2]")
	private WebElement DecChildren_oneway;
	
	@FindBy(xpath="(//div[@id='one-way']//div[@class='qtyInc'])[2]")
	private WebElement SumChildren_oneway;
	
	@FindBy(xpath="//button[@aria-owns='bs-select-3']")
	private WebElement cbCoach_oneway;
	
	@FindBy(xpath="//ul[@class='dropdown-menu inner show']//a[@id='bs-select-3-2']")
	private WebElement cboptionCoach_oneway;
	
	@FindBy(xpath="//div[@id='one-way']//a[normalize-space()='Search Now']")
	private WebElement btnsearch_oneway;
	
	@FindBy(xpath="(//img[@alt='logo'])[1]")
	private WebElement logo;
	
	@FindBy(xpath="//div[@id='round-trip']/descendant::input[1]")
	private WebElement txtfrom_roundtrip;
	
	@FindBy(xpath="//div[@id='round-trip']/descendant::input[2]")
	private WebElement txtto_roundtrip;
	
	@FindBy(xpath="//div[@id='round-trip']/descendant::input[3]")
	private WebElement dateDeparting_Returning_roundtrip;
	
	@FindBy(xpath="(//a[@data-toggle='dropdown'])[2]")
	private WebElement cbPassengers_roundtrip;
	
	@FindBy(xpath="(//div[@id='round-trip']//div[@class='qtyInc'])[1]")
	private WebElement SumAdults_roundtrip;
	
	@FindBy(xpath="(//div[@id='round-trip']//div[@class='qtyInc'])[2]")
	private WebElement SumChildren_roundtrip;
	
	@FindBy(xpath="//button[@aria-owns='bs-select-4']")
	private WebElement cbCoach_roundtrip;
	
	@FindBy(xpath="//ul[@class='dropdown-menu inner show']//a[@id='bs-select-4-2']")
	private WebElement cboptionCoach_roundtrip;
	
	@FindBy(xpath="//div[@id='round-trip']//a[normalize-space()='Search Now']")
	private WebElement btnsearch_roundtrip;
	
	public Search_Flights (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Search_oneway(String Flyingfrom,String Flyingto,String Departing ) {
		txtfrom_oneway.sendKeys(Flyingfrom);
		
		txtto_oneway.sendKeys(Flyingto);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')",dateDeparting_oneway);
		dateDeparting_oneway.clear();
		dateDeparting_oneway.sendKeys(Departing);
		dateDeparting_oneway.sendKeys(Keys.TAB);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		pause(3000);
		js.executeScript("arguments[0].click()", cbPassengers_oneway);
		pause(3000);
		js.executeScript("arguments[0].click()", SumAdults_oneway);
		pause(3000);
		js.executeScript("arguments[0].click()", SumChildren_oneway);
		pause(3000);
		js.executeScript("arguments[0].click()", cbCoach_oneway);
		pause(3000);
		js.executeScript("arguments[0].click()", cboptionCoach_oneway);
		pause(3000);
		js.executeScript("arguments[0].click()", btnsearch_oneway);
	}
	public void Search_roundtrip(String Flyingfrom,String Flyingto,String Departing ) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", logo);
		pause(3000);
		WebDriverWait wait = new WebDriverWait(driver, initWaitTime);
		wait.until(ExpectedConditions.elementToBeClickable(rd_roundtrip));
		js.executeScript("arguments[0].click()", rd_roundtrip);
		wait.until(ExpectedConditions.elementToBeClickable(txtfrom_roundtrip));
		txtfrom_roundtrip.sendKeys(Flyingfrom);
		wait.until(ExpectedConditions.elementToBeClickable(txtto_roundtrip));
		txtto_roundtrip.sendKeys(Flyingto);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')",dateDeparting_Returning_roundtrip);
		dateDeparting_Returning_roundtrip.clear();
		dateDeparting_Returning_roundtrip.sendKeys(Departing);
		dateDeparting_Returning_roundtrip.sendKeys(Keys.TAB);
		
		pause(3000);
		js.executeScript("arguments[0].click()", cbPassengers_roundtrip);
		pause(3000);
		js.executeScript("arguments[0].click()", SumAdults_roundtrip);
		pause(3000);
		js.executeScript("arguments[0].click()", SumChildren_roundtrip);
		pause(3000);
		js.executeScript("arguments[0].click()", cbCoach_roundtrip);
		pause(3000);
		js.executeScript("arguments[0].click()", cboptionCoach_roundtrip);
		pause(3000);
		js.executeScript("arguments[0].click()", btnsearch_roundtrip);

	}
}
