package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_Checkbox_Radio_Dropdown extends CommonBase {
	public void isSingleCheckboxSelected() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.findElement(By.id("isAgeSelected")).isSelected();
		boolean isSelected = false;
		// Tiếp theo, nếu như check box chưa được check thì thực hiện click vào ô
		// checkbox đó:
		if (isSelected == false) {
			driver.findElement(By.id("isAgeSelected")).click();
			System.out.println("Checkbox đang được select");
		}
		driver.close();
	}
	@Test
	public void isRadioButtonSelected() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		// Tìm locator của Male checkbox và lưu vào Webelement
		WebElement checkboxMale=driver.findElement(By.xpath("(//input[@value='Male' and @type='radio'])[1]"));
		checkboxMale.click();
		// Kiểm tra checkbox Male đã được chọn hay chưa
		boolean isSelected = checkboxMale.isSelected();
		if(isSelected ==false)
		{
			// Nếu false tức là chưa chọn thì click chọn
			checkboxMale.click();
			System.out.println("Male radio button is selected");
		}
		else {
			WebElement checkboxFemale=driver.findElement(By.xpath("(//input[@value='Female' and @type='radio'])[1]"));
			// Nếu mà Male đã được check thì check vào Female còn lại
			// 1. Tìm locator của Female, 2. sau đó click vào Female, 3. in ra
			checkboxFemale.click();
			System.out.println("Female radio button is selected");
		}
		driver.close();
	}
	
	/* Testcase: 1. vào trang dropdownlist https://demo.seleniumeasy.com/basic-select-dropdown-demo.html
	2. Tìm đến thẻ select là dropdownlist
	3. Tìm size của dropdownlist
	4. Click chọn Monday bằng 3 cách
	5. Sau khi chọn xong kiểm tra lại text đã đúng giá trị mình chọn hay chưa => Expected value: "Monday"
	*/
	@Test
	public void selectDropdownlist() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		// 2
		Select dropDaySelect = new Select(driver.findElement(By.id("select-demo")));
		//3
		System.out.println("Size is: "+dropDaySelect.getOptions().size());
		//4
		WebElement dropDayWeblement = driver.findElement(By.id("select-demo"));
		dropDayWeblement.click();// Mở dropdownlist
		//dropDaySelect.selectByVisibleText("Monday");
		 dropDaySelect.selectByIndex(2);
		//dropDaySelect.selectByValue("Monday");
		dropDayWeblement.click(); // Đóng dropdownlist
		driver.close();
	}	
	
}
