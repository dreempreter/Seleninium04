package com.neotech12sabah;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class ScreenshotDemo extends CommonMethods{
public static void main(String[] args) {
	
	setUp();
	
	sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
	
	sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
	
	
	click(driver.findElement(By.xpath("//button[@type='submit']")));
	
	
	wait(4);
	
	//downcasting
	TakesScreenshot ts= (TakesScreenshot) driver; // get the camera and take a pic
	
	//take the screenshot
	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	
	//save it somewhere
	
	try {
		FileUtils.copyFile(sourceFile, new File("screenshots/HRM/screenhot01.png"));
	} catch (IOException e) {
		
		e.printStackTrace();
		System.out.println("We did not save screenshot");
	}
	
	
	
	tearDown();
	
	
	
	
	
	
	
	
}
}
