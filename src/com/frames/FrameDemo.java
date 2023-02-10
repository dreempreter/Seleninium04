package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class FrameDemo extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	
	driver.switchTo().frame(0); //swtich attention to frame 0
	WebElement nameBox = driver.findElement(By.id("name"));
	nameBox.sendKeys("Murad");
	
	Thread.sleep(3000);
	
	driver.switchTo().defaultContent();
	
	//2nd way
	
/*//	driver.switchTo().frame(By.xpath("//iframe[@name='iframe_a']"));
//	tearDown();
*/	
	
	
	
	
}
}
