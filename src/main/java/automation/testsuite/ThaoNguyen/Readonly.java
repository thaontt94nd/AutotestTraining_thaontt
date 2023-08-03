package automation.testsuite.ThaoNguyen;

import automation.common.CommonBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public final class Readonly extends CommonBase {

	@BeforeTest
	public void openSystemUnderTest() {
		driver = initChromeDriver("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
	}
	
	@Test
	public void ChooseDatePicker() {
		WebElement dateBox = driver.findElement(
				By.xpath("(//label[text()='Departing']/following-sibling::div//input[@name='daterange-single'])[1]"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')",dateBox);
		
		dateBox.clear();
		dateBox.sendKeys("12062025");
		dateBox.sendKeys(Keys.TAB);
		System.out.println("Thành Công");
	}
	@AfterTest
	public void closeBrowTest() {
		quitDriver(driver);
	}
}
