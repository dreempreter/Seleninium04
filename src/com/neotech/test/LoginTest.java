package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class LoginTest extends CommonMethods {
public static void main(String[] args) {
	//https://hrm.neotechacademy.com/
	setUp();
	WebElement username=driver.findElement(By.id("txtUsername"));
	sendText(username, ConfigsReader.getProperty("username"));
	
	
	WebElement password=driver.findElement(By.id("txtPassword"));
	sendText(password, ConfigsReader.getProperty("password"));
	
	WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
	click.click();
	
	wait(4);
	
	WebElement logo=driver.findElement(By.xpath("//div[@id='ohrm-small-logo']"));
	if(logo.isDisplayed())
	{
		System.out.println(" Test Passed ");
	}
		else
		{
			System.out.println("Test failed! ");
		}
	
	
	tearDown();
	
}
}
