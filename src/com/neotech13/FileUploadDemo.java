package com.neotech13;

import org.openqa.selenium.By;

import Utils.CommonMethods;

public class FileUploadDemo extends CommonMethods{
public static void main(String[] args) {
	
	setUp();
	
	click(driver.findElement(By.linkText("File Upload")));
	
	String filePath = System.getProperty("user.dir") + "/screenshots/HRM/screenhot01.png";
	
	sendText(driver.findElement(By.id("file-upload")), filePath);
	wait(2);
	click(driver.findElement(By.id("file-submit")));
	wait(2);
	
	tearDown();
	
	
	
	
}
}
