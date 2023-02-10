package com.neotech14pages;

import Utils.CommonMethods;
import elionpractices.ConfigsReader;

public class LoginTestUsingFactory extends CommonMethods{
public static void main(String[] args) {
	
	setUp();
	
	//At this point we are not locating the elements
	//We are just telling how the elemenets will be located
	LoginPageUsingFactory login = new LoginPageUsingFactory();
	
	//sending username
	sendText(login.username, ConfigsReader.getProperty("username"));
	
	//sendig password
	sendText(login.password, ConfigsReader.getProperty("password"));
	login.loginBtn.click();
	wait(2);
	
	
	
	tearDown();
	
}
}
