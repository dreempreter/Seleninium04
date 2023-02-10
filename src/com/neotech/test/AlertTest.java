package com.neotech.test;

import org.openqa.selenium.By;

import Utils.CommonMethods;

public class AlertTest extends CommonMethods {
public static void main(String[] args) {
	
	setUp();
	
	driver.findElement(By.id("alert")).click();
	wait(2);

	System.out.println(getAlertText());
	acceptAlert();
	wait(2);
	
	driver.findElement(By.id("confirm")).click();
	System.out.println(getAlertText());
	dismissAlert();
	wait(2);
	
	driver.findElement(By.id("prompt")).click();
	System.out.println(getAlertText());
	sendAlertText("Flori lost in Domino");
	acceptAlert();
	
	tearDown();
	
	
}
}
