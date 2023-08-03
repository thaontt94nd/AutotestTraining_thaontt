package automation.PageLocatorThaoNguyen;

import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import automation.common.CommonBase;

public class viewproject extends CommonBase {
	//Login object
    private By buttonSignin = By.xpath("//button[normalize-space()='Sign in']");
  //Dashboard object
    private By dashboard = By.xpath("//span[normalize-space()='Dashboard']");
    private By menuProject = By.xpath("//span[normalize-space()='Projects']");
    //filter
    private By filter = By.xpath("//div[@class='dropdown smart-filter-dropdown-container']//button");
    private By txtsearch = By.xpath("//input[@class='form-control search-filter']");
    private By dropdownfilter = By.xpath("//a[normalize-space()='Completed']");
    private By btncleanfilter = By.xpath("//a[normalize-space()='Clear']");
    private By btnmanagefilter = By.xpath("//a[normalize-space()='Manage Filters']");
    //managefilter
    private By search_managefilter = By.xpath("//div[@id='filters-table_filter']//input[@class='form-control form-control-sm']");
    private By Change_filters_managefilter = By.xpath("(//a[@title='Change filters'])[4]");
    private By Edit_managefilter = By.xpath("(//a[@title='Edit'])[4]");
    private By Delete_managefilter = By.xpath("((//a[@title='Delete'])[4]");
    
    //icon +
    private By btnextendedfilter = By.xpath("//button[@class='btn btn-default show-filter-form-button']");
   //bookmark
    private By bookmarkallproject = By.xpath("//button[@data-id='ecmkusuchl']");
    private By bookmarkallHighPriority = By.xpath("//button[@data-id='nkuyhedude']");
    //Setup colum
    private By setupcolum = By.xpath("//ul[@data-table='project-table']//li[4]");
    //label
    private By label = By.xpath("//div[@id='s2id_autogen3']//a");
    private By searchlabel = By.xpath("//input[@id='s2id_autogen4_search']");
    private By dropdownlabel = By.xpath("//ul[@id='select2-results-4']//li[4]");
    //Startdate
    private By startdate = By.xpath("//div[normalize-space()='Start date']");
    private By drpstartdate = By.xpath("//li[normalize-space()='Next 7 Days']");
    
    private By Startfrom = By.xpath("//button[@name='start_date_from']");
    private By datefrom = By.xpath("((//table[@class='table-condensed']//tbody//tr)[1]//td)[5]");
    private By Startto = By.xpath("//button[@name='start_date_to']");
    private By dateto = By.xpath("((//table[@class='table-condensed']//tbody//tr)[5]//td)[5]");
    private By btncleandate = By.xpath("//div[normalize-space()='Clear']");
    
    //deadline
    private By deadline = By.xpath("//button[@name='deadline']");
    private By drpdeadline_in7day = By.xpath("//div[normalize-space()='In 7 days']");
    private By drpdeadline_Custom = By.xpath("//div[normalize-space()='Custom']");
    //status
    private By status = By.xpath("//button[normalize-space()='Status']");
    private By drpstatus = By.xpath("//li[normalize-space()='Open']");
    //addnewfilter
    private By addnewfilter = By.xpath("//button[@data-post-instance_id='project-table']");
    private By txttitle = By.xpath("//input[@name='title']");
    private By checkboxbookmark = By.xpath("//input[@name='bookmark']");
    private By iconfilter = By.xpath("//span[@data-icon='anchor']");
    private By btnsave = By.xpath("//button[@type='submit']");
    private By btnclose = By.xpath("//button[@type='submit']//preceding-sibling::button");
    public viewproject (WebDriver _driver){
		this.driver=_driver;
	}
	//Login
    public void login() {
        click(buttonSignin);
    }
  //menuproject
    public void menuproject() {
        click(menuProject);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.stop();");
    }
    //filter
    public void filterproject(String value) {
    	clickJavaScript(filter);
//    	click(filter);
    	setText(txtsearch, value);
    	click(dropdownfilter);
    	pause(5000);
    }
    public void checkSearchTableByColumn(int column, String value) {
    	filterproject(value);
        //Xác định số dòng của table sau khi search
//    	WebElement table = driver.findElement(By.xpath("//table[@id='project-table']//tbody"));
//    	List < WebElement > rows_table = table.findElements(By.tagName("tr"));
    	List < WebElement > rows_table = driver.findElements(By.xpath("//table[@id='project-table']//tbody/tr"));
    	int rows_count = rows_table.size();
        System.out.println("Số dòng tìm thấy: " + rows_count);
 
        //Duyệt từng dòng
        for (int i = 1; i <= rows_count; i++) {
        	WebElement elementCheck = driver.findElement(By.xpath("//table[@id='project-table']//tbody/tr[" + i + "]//td["+column+"]"));
        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementCheck);
        	System.out.print(value + " - ");
            System.out.println(elementCheck.getText());
            Assert.assertTrue(elementCheck.getText().toUpperCase().contains(value.toUpperCase()), "Dòng số " + i + " không chứa giá trị tìm kiếm.");
        }           
     }
    
}
