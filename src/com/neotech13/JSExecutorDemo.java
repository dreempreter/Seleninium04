package com.neotech13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class JSExecutorDemo extends CommonMethods{
public static void main(String[] args) {
	
	
	
	setUp();
	
	WebElement username = driver.findElement(By.id("txtUsername"));
	
	WebElement password = driver.findElement(By.id("txtPassword"));
	
	sendText(username, ConfigsReader.getProperty("username"));
	sendText(password, ConfigsReader.getProperty("password"));
	
	wait(2);
	
	//create an object of JSExecutor
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].style.backgroundColor='blue';"
			+ "arguments[1].style.backgroundColor='red'", username, password);
	
	
	js.executeScript("arguments[0].click()",
			driver.findElement(By.xpath("//button[@type='submit']")));
	
	
	
	
	//go to employee list
			click(driver.findElement(By.id("menu_pim_viewPimModule")));
			click(driver.findElement(By.linkText("Employee List")));
	
	
	wait(5);
	
	
	
	//Scrolling with javaScript
	
	js.executeScript("window.scrollBy(0, 2000)");
	
	
	wait(5);
	
	//scrolling up- by 300 pixels
	
	js.executeScript("window.scrollBy(0,-300)");
	
	
	wait(4);
	
	
	
	
	tearDown();
}
}
