package sabahpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;
import Utils.ConfigsReader;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HomeWork extends BaseClass{

//TC 2: Orange HRM Application Negative Login: 
//Open Chrome browser
//Go to https://hrm.neotechacademy.com/
//Enter valid username
//Leave password field empty
//Verify error message with text "Password cannot be empty" is displayed.
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		String user = ConfigsReader.getProperty("username");
		String pass ="";
		
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
Thread.sleep(3000);
		
		
		WebElement errorMsg = driver.findElement(By.id("txtPassword-error"));
		
		if(errorMsg.isDisplayed())
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		tearDown();
		
		
		
	}
}
