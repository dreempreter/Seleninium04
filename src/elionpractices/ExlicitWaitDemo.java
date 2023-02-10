package elionpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.BaseClass;

public class ExlicitWaitDemo extends BaseClass {
public static void main(String[] args) {
	
	setUp();
	
	driver.findElement(By.linkText("This is a Ajax link")).click();
	
	//We are creating an object of WebDriverWait
	//We are defining max time to wait
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ContactUs")));
	
	WebElement div=driver.findElement(By.className("ContactUs"));
	
	boolean isDisplayed=div.isDisplayed();
	System.out.println("Div is disDislpayed-> " + isDisplayed);
	
	
	tearDown();
}
}
