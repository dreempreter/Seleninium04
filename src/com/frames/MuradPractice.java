package com.frames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class MuradPractice extends BaseClass {
//	1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//	3) On the Child Window, Enter your email ID and submit.
//	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//	5) Close the Child window on which credentials are displayed.Switch to the parent window.
//	6) Quit all browsers
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		System.out.println("Title ---> " + driver.getTitle());
		
		System.out.println("Handle ---> " + driver.getWindowHandle());
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		
		String window1 = it.next();
		String window2 = it.next();
		
		System.out.println("Window1: " + window1);
		System.out.println("Window2: " + window2);
		
		driver.switchTo().window(window2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength='50']")).sendKeys("murad-bayramov-95@mail.ru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).submit();
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(2000);
		
		
		
		tearDown();
		
		
		
		
	}
}
