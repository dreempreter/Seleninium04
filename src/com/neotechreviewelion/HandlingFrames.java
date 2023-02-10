package com.neotechreviewelion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class HandlingFrames extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	Thread.sleep(1000);
	
	//1st way by index
	//driver.switchTo().frame(0);
	
	//2nd way by id or Name
	
	//driver.switchTo().frame("mce_0_ifr");
	
	//3rd way by WebElement
	WebElement frame=driver.findElement(By.id("mce_0_ifr"));
	driver.switchTo().frame(frame);
	
	WebElement frameElement=driver.findElement(By.xpath("//body[@id='tinymce']"));
	frameElement.clear();
	Thread.sleep(1000);
	frameElement.sendKeys("Murad will be so fine after Leave Empire Pizza");
	Thread.sleep(1000);
	
	tearDown();
	
}
}
