package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class NestedFrames extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
	
setUp();

driver.switchTo().frame("frame1");

WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));

driver.switchTo().frame(childFrame);


WebElement p = driver.findElement(By.xpath("/html/body/p"));
System.out.println(p.getText() + " ");

driver.switchTo().defaultContent();
Thread.sleep(3000);

tearDown();
	
	
	}
}
