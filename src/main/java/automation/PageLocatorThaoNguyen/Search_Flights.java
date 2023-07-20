package automation.PageLocatorThaoNguyen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_Flights {
	private WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='One way']")
	private WebElement rd_oneway;
	
	@FindBy(xpath="//a[normalize-space()='Round-trip'] ")
	private WebElement rd_roundtrip;
	
	@FindBy(xpath="//a[normalize-space()='Multi-city'] ")
	private WebElement rd_multicity;
	
	@FindBy(xpath="//div[@id='one-way']/descendant::input[1]")
	private WebElement txtfrom_oneway;
	
	@FindBy(xpath="//div[@id='one-way']/descendant::input[2]")
	private WebElement txtto_oneway;
	
	@FindBy(xpath="//div[@id='one-way']/descendant::input[3]")
	private WebElement dateDeparting_oneway;
	
	@FindBy(xpath="//div[@id='one-way']//div[@class='dropdown dropdown-contain gty-container']")
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
		
		js.executeScript("arguments[0].click()", cbPassengers_oneway);
		
		js.executeScript("arguments[0].click()", SumAdults_oneway);
		
		js.executeScript("arguments[0].click()", SumChildren_oneway);
		
		js.executeScript("arguments[0].click()", cbCoach_oneway);
		
		js.executeScript("arguments[0].click()", cboptionCoach_oneway);
		
		js.executeScript("arguments[0].click()", btnsearch_oneway);
	}
	
}
