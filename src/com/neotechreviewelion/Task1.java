package com.neotechreviewelion;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class Task1 extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.findElement(By.xpath("//a[@title='seleniumframework']")).click();
		Thread.sleep(1000);
		
		Set<String> allHandles= driver.getWindowHandles();
		
		Iterator<String> it=allHandles.iterator();
		String handle1=it.next();
		String handle2= it.next();
		
		for(int i=1; i<=5; i++)
		{
			driver.switchTo().window(handle1);
			
			Thread.sleep(400);
			
			driver.switchTo().window(handle2);
			Thread.sleep(400);
			
			driver.close();
			
		}
		
		tearDown();
		
		
		
		
	}

}
