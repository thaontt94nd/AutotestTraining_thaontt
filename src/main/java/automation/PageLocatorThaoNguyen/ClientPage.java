package automation.PageLocatorThaoNguyen;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class ClientPage {
	private WebDriver driver;
	
	public static By addclient=By.xpath("//a[@title='Add client']");
	
	@FindBy(id="type_organization")
	private WebElement rdotype_organization;
	
	@FindBy(id="type_person")
	private WebElement rdotype_person;
	
	@FindBy(id="company_name")
	private WebElement txtcompany_name;
	
	@FindBy(id="select2-chosen-3")
	private WebElement drpOwner;
	
	@FindBy(id="address")
	private WebElement txtaddress;
	
	@FindBy(id="city")
	private WebElement txtcity;
	
	@FindBy(id="state")
	private WebElement txtstate;
	
	@FindBy(id="zip")
	private WebElement txtzip;
	
	@FindBy(id="country")
	private WebElement txtcountry;
	
	@FindBy(id="phone")
	private WebElement txtphone;
	
	@FindBy(id="website")
	private WebElement txtwebsite;
	
	@FindBy(id="vat_number")
	private WebElement txtvat_number;
	
	@FindBy(id="gst_number")
	private WebElement txtgst_number;
	
	@FindBy(xpath="//div[@id='s2id_group_ids']/ul/li/input")
	private WebElement drpClient_groups;
	
	@FindBy(id="s2id_currency")
	private WebElement drpcurrency;
	
	@FindBy(id="currency_symbol")
	private WebElement txtcurrency_symbol;
	
	@FindBy(id="disable_online_payment")
	private WebElement cbdisable_online_payment;
	
	@FindBy(xpath="//div[@id='link-of-add-contact-modal']/following-sibling::button[1]")
	private WebElement btnclose;
	
	@FindBy(xpath="//div[@id='link-of-add-contact-modal']/following-sibling::button[2]")
	private WebElement btnsave_continue;
	
	@FindBy(xpath="//div[@id='link-of-add-contact-modal']/following-sibling::button[3]")
	private WebElement btnsave;
	
	public ClientPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void ClientFuntion (String company_name, String address, String city,String state, String zip, String country, String phone,
			String website,String vat_number, String gst_number,String currency_symbol) {
		rdotype_person.click();
		txtcompany_name.sendKeys(company_name);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		drpOwner.click();
		//Chọn giá trị owner
		WebElement ownerOption = driver.findElement(By.xpath("//div[normalize-space()='Sara Ann']"));
		ownerOption.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		txtaddress.sendKeys(address);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtcity.sendKeys(city);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtstate.sendKeys(state);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtzip.sendKeys(zip);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtcountry.sendKeys(country);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtphone.sendKeys(phone);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtwebsite.sendKeys(website);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtvat_number.sendKeys(vat_number);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtgst_number.sendKeys(gst_number);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		drpClient_groups.click();
		//Chọn giá trị owner
		WebElement Client_groupsOption = driver.findElement(By.xpath("//div[normalize-space()='Gold']"));
		Client_groupsOption.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		drpcurrency.click();
		//Chọn giá trị owner
		WebElement currency_symbolOption = driver.findElement(By.xpath("//div[normalize-space()='AED']"));
		currency_symbolOption.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
//		Actions actions = new Actions(driver);
//		actions.moveByOffset(0, 100000).click().build().perform();
		WebElement element = driver.findElement(By.id("currency_symbol"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		txtcurrency_symbol.sendKeys(currency_symbol);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		cbdisable_online_payment.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		btnsave.click();
		
	}	
}
