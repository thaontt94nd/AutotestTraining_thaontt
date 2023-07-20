package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AlertBasic extends CommonBase {
	@BeforeTest
	public void alertopen() {
		driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
	}
	
	@Test
	public void testalert() throws InterruptedException {
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).submit();
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		
		System.out.println("alertMessage");
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();//cách 1
//		alert.accept();//cách 2
		alert.dismiss();
		Thread.sleep(2000);
	}
	@AfterTest
	public void alertclose() {
		quitDriver(driver);
	}
}
