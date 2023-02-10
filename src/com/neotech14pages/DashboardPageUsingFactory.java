package com.neotech14pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class DashboardPageUsingFactory {

/*	public WebElement logo = driver.findElement(By.id("ohrm-small-logo"));
	
	
	public WebElement name = driver.findElement(By.xpath("//span[@id='account-name']"));*/
	
	@FindBy(id="ohrm-small-logo")
	public WebElement logo;
	
	public DashboardPageUsingFactory()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
