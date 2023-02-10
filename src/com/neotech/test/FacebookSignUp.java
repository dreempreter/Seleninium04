package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;


public class FacebookSignUp extends CommonMethods {
public static void main(String[] args) {
	/*
	 * TC 1: Facebook dropdown verification 
	 * 1. Open chrome browser 
	 * 2. Go to https://www.facebook.com/r.php 
	 * 3. Verify: month dd has 12 month options day dd has 31 day options year dd has 118 year options 
	 * 4. Select your date of birth 
	 * 5. Quit browser
	 */
	setUp();
	
	WebElement month=driver.findElement(By.id("month"));
	//selectDropdown(month, 4);

	////we can do the same thing in just one step
	selectDropdown(driver.findElement(By.id("month")), 8);
	
	wait(2);
	
	WebElement day = driver.findElement(By.id("day"));
	selectDropdown(day, "25");
	wait(2);
	
	tearDown();
	
}
}
