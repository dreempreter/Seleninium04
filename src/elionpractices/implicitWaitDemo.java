package elionpractices;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class implicitWaitDemo extends BaseClass{
public static void main(String[] args) {
	setUp();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
	driver.findElement(By.linkText("This is a Ajax link")).click();
	
	WebElement div=driver.findElement(By.xpath("//div[@class='ContactUs']"));
	String text=div.getText();
	
System.out.println("The text is : " + text);

	
	
	
	tearDown();
	
	
	
	
}
}
