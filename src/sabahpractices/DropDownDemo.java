package sabahpractices;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BaseClass;
import Utils.ConfigsReader;


public class DropDownDemo extends BaseClass{

public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	driver.findElement(By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));
	driver.findElement(By.id("tPassword")).sendKeys(ConfigsReader.getProperty("password"));
	Thread.sleep(3000);

	
	//How do we deal with the dropdown
	
	WebElement dd =driver.findElement(By.id("dAcademicYear_list"));
	
	Select selDD = new Select(dd);
	
	
	//1st way to select
	selDD.selectByIndex(0);
	
	Thread.sleep(3000);
	//2nd way
	
	selDD.selectByValue("10");
	
	Thread.sleep(3000);
	
	//3rd way
	selDD.selectByVisibleText("2017-2018");
	
	
	Thread.sleep(3000);
	
	//we know select has list of options, so how do we get it?
	
	List<WebElement> options =selDD.getOptions();
	
	System.out.println("The size of the list is: " + options.size());
	
	for(int i =0; i<options.size(); i++)
	{
		selDD.selectByIndex(i);
		Thread.sleep(3000);
	}
	
	
	
	
	
	tearDown();
	
	
	
}
}
