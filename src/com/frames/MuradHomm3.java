package com.frames;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BaseClass;

public class MuradHomm3 extends BaseClass{
//	1) Launch the browser and open the site 
//     "https://www.tutorialspoint.com/selenium/selenium_automation_practice"
//	2) Fill in the all text boxes, Choose your preferred radio button, 
//     check box and drop down option 
//	EXCEPT Profile Picture (Dissmiss this Section)
//	3) Click on the Button and you will see an Alert pops up then click Ok
//	4) When user clicks on Ok new Window will open then get 
//    All window handles and get the size and Quit all of them
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Murad");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bayramov");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("02/15/1995");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[8]/td[2]/span[3]/input")).click();
		
		WebElement con= driver.findElement(By.name("continents"));
		Select selCon= new Select(con);
		selCon.selectByIndex(1);
		
		WebElement sel = driver.findElement(By.name("selenium_commands"));
		Select selSelenium = new Select(sel);
		selSelenium.selectByIndex(1);
		
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[11]/td[2]/button")).click();
		Thread.sleep(3000);
		
		Alert button = driver.switchTo().alert();
		button.accept();
		Thread.sleep(2000);
		
		
		Set<String>allWindows=driver.getWindowHandles();	
		System.out.println("The size of all windows is : " + allWindows.size());
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		tearDown();
	}
}
