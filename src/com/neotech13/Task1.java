package com.neotech13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.CommonMethods;

public class Task1 extends CommonMethods{
public static void main(String[] args) {
	// https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload

	
			/*
			 * TC 1: Upload file and Take Screenshot 1. Navigate to
			 * http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload 
			 * 2. Upload file 3. 
			 * Verify file got successfully uploaded and take screenshot
			 */
	
	setUp();
	
	String filePath= System.getProperty("user.dir") + "/screenshots/HRM/screenhot01.png";
	sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);
	wait(2);
	click(driver.findElement(By.xpath("//button[@class='gwt-Button']")));
	
	acceptAlert();
	
	TakesScreenshot ts =(TakesScreenshot) driver;
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	File destinationFile = new File("screenshots/Lesson13/FileUpload.png");
	try {
		FileUtils.copyFile(sourceFile, destinationFile);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
	
	tearDown();
}
}
