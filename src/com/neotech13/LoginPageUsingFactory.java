package com.neotech13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class LoginPageUsingFactory{

	@FindBy(id="email")
    public WebElement username;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement loginBTN;
	
	/*@FindBy(xpath="//div[@class='toast-message']")
	public WebElement message;*/
	
	public LoginPageUsingFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
	
	

	