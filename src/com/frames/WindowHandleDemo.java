package com.frames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class WindowHandleDemo extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	
	setUp();
	
	System.out.println("The title of windows " + driver.getTitle());
	
	
	//This will give us unique id for this window/tab
	System.out.println("Windows Handle----> " + driver.getWindowHandle());
	
	driver.findElement(By.linkText("Help")).click();
	Thread.sleep(2000);
	
	Set<String>allWindowHandles = driver.getWindowHandles();
	
	System.out.println("Number of open windows/tabs " + allWindowHandles.size());
	
	Iterator<String> it = allWindowHandles.iterator();
	String window1= it.next();
	String windows2=it.next();
	
	driver.switchTo().window(windows2);
	
	
	tearDown();
}
}