package automation.PageLocatorThaoNguyen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage_Factory {
	private WebDriver driver;
	
	@FindBy(xpath="//a[@title='Add client']")
	private WebElement btnaddclient;
	
	@FindBy(id="type_organization")
	private WebElement rdotype_organization;
	
	@FindBy(id="type_person")
	private WebElement rdotype_person;
	
	@FindBy(id="company_name")
	private WebElement txtcompany_name;
	
	@FindBy(id="s2id_created_by")
	private WebElement drpOwner;
	
	@FindBy(xpath="//div[normalize-space()='Sara Ann']")
	private WebElement ownerOption;
	
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
	
	@FindBy(xpath="//div[normalize-space()='Gold']")
	private WebElement Client_groupsOption;
	
	@FindBy(id="s2id_currency")
	private WebElement drpcurrency;
	
	@FindBy(xpath="//div[normalize-space()='AED']")
	private WebElement currencyOption;
	
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
	
	@FindBy(xpath="//span[text()='Total clients']")
	private WebElement totalClientCard;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement btnsearch;
	
	@FindBy(xpath="//a[normalize-space()='thao4']")
	private WebElement searchResult;
	
	public ClientPage_Factory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClientFuntion (String company_name, String address, String city,String state, String zip, String country, String phone,
			String website,String vat_number, String gst_number,String currency_symbol) {
		btnaddclient.click();
		rdotype_person.click();
		txtcompany_name.sendKeys(company_name);
		drpOwner.click();
		ownerOption.click();
		txtaddress.sendKeys(address);
		txtcity.sendKeys(city);
		txtstate.sendKeys(state);
		txtzip.sendKeys(zip);
		txtcountry.sendKeys(country);
		txtphone.sendKeys(phone);
		txtwebsite.sendKeys(website);
		txtvat_number.sendKeys(vat_number);
		txtgst_number.sendKeys(gst_number);
		drpClient_groups.click();
		Client_groupsOption.click();
		drpcurrency.click();
		currencyOption.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtcurrency_symbol);
		txtcurrency_symbol.sendKeys(currency_symbol);
		cbdisable_online_payment.click();
		btnsave.click();
	}

}
