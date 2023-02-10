package com.neotech14pages;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods{
public static void main(String[] args)  {
	
	setUp();
	LoginPage login = new LoginPage();

	sendText(login.username, ConfigsReader.getProperty("username"));
	
	sendText(login.password, ConfigsReader.getProperty("password"));
	
	login.loginBtn.click();
	wait(2);
	
	//Validate login by usuing the logo
	DashboardPage dashboard = new DashboardPage();
	
	if(dashboard.logo.isDisplayed()) {
		System.out.println("Test is passed");

}
	else {
		System.out.println("Test failed");
	}
	
	//lets validate "Jacqueline White is displayed
	
	String expectedName= "Jacqueline White";
	String actual = dashboard.name.getText();
	
	if(actual.equals(expectedName))
	{
		System.out.println("Expected name is displayed " + expectedName);
	}
	else
	{
		System.out.println(expectedName + " is Not displayed ");
	}
	
	tearDown();
}
}
