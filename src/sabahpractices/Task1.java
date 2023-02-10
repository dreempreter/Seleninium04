package sabahpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BaseClass;

public class Task1 extends BaseClass {
//	 TC 1: Facebook dropdown verification 
//	 * 1. Open chrome browser 
//	 * 2. Go to https://www.facebook.com/r.php 
//	 * 3. Verify: month dd has 12 month options day dd has 31 day options year dd has 118 year options 
//	 * 4. Select your date of birth 
//	 * 5. Quit browser
	
public static void main(String[] args) {
	
	setUp();
	
	WebElement day = driver.findElement(By.id("day"));
	
			Select SeIDD = new Select(day);
	SeIDD.selectByIndex(6);
	
	WebElement month = driver.findElement(By.id("month"));
	
	SeIDD.selectByIndex(1);
	
	WebElement year = driver.findElement(By.id("year"));
	SeIDD.selectByIndex(28);
	
	
	
	
	
	tearDown();
	
	
	
	
}
}
