package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BaseClass;

public class MuradHome2 extends BaseClass {
//	1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//	2) Verify on the page header "Not a Friendly Topic" displayed
//	3) Click on the Inner Frame Check box
//	4) Choose baby Cat from Animals dropdown
//	5) Quit the browser
public static void main(String[] args) throws InterruptedException {
	setUp();
	
	WebElement wb = driver.findElement(By.cssSelector("#page-top > div > div > div > div > div > label > span"));
	if(wb.getText().equalsIgnoreCase("not a friendly topic")) {
	System.out.println("Success---Not a friendly topic > " + wb.isDisplayed());
	}else
	{
		System.out.println("Try one more time");
	}
	
	driver.switchTo().frame("frame1");
	driver.switchTo().frame("frame3");
	WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkBox.click();
	
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("frame2");
	Thread.sleep(2000);
	WebElement animals = driver.findElement(By.id("animals"));
	
	Select selCat = new Select(animals);
	selCat.selectByValue("babycat");
	Thread.sleep(3000);
	driver.close();
	
	tearDown();
	
	
	
}
}
