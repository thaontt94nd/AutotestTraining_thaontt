package automation.PageLocatorThaoNguyen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addmultiplecontacts {
	private WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement txtfirstname;
	
	@FindBy(id="last_name")
	private WebElement txtlastname;
	
	@FindBy(id="email")
	private WebElement txtemail;
	@FindBy(id="phone")
	private WebElement txtphone;
	
	@FindBy(id="skype")
	private WebElement txtskype;
	
	@FindBy(id="job_title")
	private WebElement txtjob_title;
	
	@FindBy(id="gender_male")
	private WebElement rdogendermale;
	
	@FindBy(id="gender_female")
	private WebElement rdogenderfemale;
	
	@FindBy(id="gender_other")
	private WebElement rdogenderother;
	
	@FindBy(id="login_password")
	private WebElement txtlogin_password;
	
	@FindBy(id="email_login_details")
	private WebElement cbemail_login_details;
	
	@FindBy(xpath="//div[@id='link-of-add-contact-modal']/following-sibling::button[1]")
	private WebElement btnclose;
	
	@FindBy(xpath="//div[@id='link-of-add-contact-modal']/following-sibling::button[2]")
	private WebElement  btnSaveandmore;
	
	@FindBy(xpath="//h4[normalize-space()='Add multiple contacts']//following-sibling::button")
	private WebElement  close;

	
	public Addmultiplecontacts (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddmultiplecontactsFuntion (String first_name, String last_name, String email,
			String phone,String skype, String job_title, String pass){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		txtfirstname.sendKeys(first_name);
		txtlastname.sendKeys(last_name);
		txtemail.sendKeys(email);
		txtphone.sendKeys(phone);
		txtskype.sendKeys(skype);
		txtjob_title.sendKeys(job_title);
		rdogenderfemale.click();
		txtlogin_password.sendKeys(pass);
		btnSaveandmore.click();
		close.click();
	}
	
	public void AddmultiplecontactsFuntion1 (String first_name, String last_name, String email,
			String phone,String skype, String job_title, String pass){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		txtfirstname.sendKeys(first_name);
		txtlastname.sendKeys(last_name);
		txtemail.sendKeys(email);
		txtphone.sendKeys(phone);
		txtskype.sendKeys(skype);
		txtjob_title.sendKeys(job_title);
		rdogenderfemale.click();
		txtlogin_password.sendKeys(pass);
		btnclose.click();
	}
}
