package com.neotech14pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class LoginPageUsingFactory {

	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginBtn;
	
	public LoginPageUsingFactory()
	{
		PageFactory.initElements(BaseClass.driver, this);
		
	}
}
