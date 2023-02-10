package com.neotech12sabah;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class ScreenshotDemo2 extends CommonMethods {
	public static void main(String[] args) {

		setUp();

		sendText(driver.findElement(By.id("txtUsername")), " ");

		sendText(driver.findElement(By.id("txtPassword")), " ");

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		
		wait(2);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRM/screenshot02.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		tearDown();

	}
}
