package elionpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 extends BaseClass555{
	
//	HW1: Orange HRM Application Login:
//		Open Chrome browser
//		Go to https://hrm.neotechacademy.com/
//		Enter valid username and password
//		Click on login button
//		Then verify that "span with id account-name" has the text "Jacqueline White".
//		Quit the browser
	
public static void main(String[] args) throws InterruptedException {
	setUp();{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Neotech@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		WebElement check = driver.findElement(By.xpath("//span[@id='account-name']"));
		if(check.equals("Jacqueline White")){
			System.out.println("The name is correct " + check.getText());
		}
		else 
		{
			System.out.println("The name is differnt " + check.getText());
		}
	}
	
	String title = driver.getTitle();
	System.out.println("Title ----> " + title);
	Thread.sleep(2000);
	
	tearDown();
	
}
}

