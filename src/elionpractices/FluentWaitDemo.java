package elionpractices;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utils.BaseClass;

public class FluentWaitDemo extends BaseClass {
public static void main(String[] args) {
	
	setUp();
	
	//We can combine implicitlyWait and FluentWait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.findElement(By.linkText("This is a Ajax link")).click();
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	
	FluentWait<WebDriver> wait = new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(25));
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.ignoring(NoSuchElementException.class);
	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ContactUs")));
	
	
	WebElement div=driver.findElement(By.className("ContactUs"));
	
	boolean isDisplayed=div.isDisplayed();
	System.out.println("Div is disDislpayed-> " + isDisplayed);
	
	tearDown();
	
	
	
}
}
