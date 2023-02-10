package com.neotech14pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class DashboardPage extends CommonMethods{

	public WebElement logo = driver.findElement(By.id("ohrm-small-logo"));
	
	
	public WebElement name = driver.findElement(By.xpath("//span[@id='account-name']"));
	
}
