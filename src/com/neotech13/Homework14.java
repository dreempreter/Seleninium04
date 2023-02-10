package com.neotech13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class Homework14 extends CommonMethods{
	/*TC 1: Orange HRM blank password validation
	1. Go to https://hrm.neotechacademy.com/
	2. Enter valid username and leave password field empty
	3. Click on login button
	4. Verify error message with text "Password cannot be empty" is displayed*/
	public static void main(String[] args) {
		
		setUp();
		LoginPageUsingFactory login = new LoginPageUsingFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
        click(login.loginBTN);
		
/*	String expected = " Password can not be empty ";
	String actual = login.message.getText();
		
		if(expected.equals(actual))
		{
			System.out.println(" Test passed ");
		
		}
		else
		{
			System.out.println(" Test failed");
		}
		*/
		
		wait(3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRM/screenshot03.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		wait(1);
		tearDown();
	}
}
