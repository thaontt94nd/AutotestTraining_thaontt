package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class IFrame extends CommonBase {
	@BeforeTest
	public void iframeopen() {
		driver = initChromeDriver("https://codestar.vn/");
	}
	@Test
	public void handleIFrame() {
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("size: " + size);
		driver.switchTo().frame(findIframe());
		type(By.id("account_phone"),"0987");
		click(By.xpath("//button[text()='Gửi ngay']"));
		
	}
	@AfterTest
	public void alertclose() {
		quitDriver(driver);
	}
}
