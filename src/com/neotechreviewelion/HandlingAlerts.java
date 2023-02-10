package com.neotechreviewelion;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.BaseClass;

public class HandlingAlerts extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	//http://www.seleniumframework.com/Practiceform/
	setUp();
	

	WebElement alertButton =driver.findElement(By.id("alert"));
	alertButton.click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.alertIsPresent());
	
	//Handling the Alert
	Alert alert = driver.switchTo().alert();
	String alertText=alert.getText();
	System.out.println("alertText is : " + alertText);
	alert.accept();
	Thread.sleep(2000);
	
	
	//Handling timing Alert
	driver.findElement(By.id("timingAlert")).click();

	wait.until(ExpectedConditions.alertIsPresent());
	
     alert= driver.switchTo().alert();
	Thread.sleep(2000);
	
	
	tearDown();
	
	
}
}
