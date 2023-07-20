package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AlertSenkey extends CommonBase {
	@BeforeTest
	public void alertopen() {
		driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
	}
	
	@Test
	public void testalert() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("Thaontt");//cách 2
//		alert.accept();
		alert.dismiss();
		Thread.sleep(2000);
	}
	@AfterTest
	public void alertclose() {
		quitDriver(driver);
	}
}
