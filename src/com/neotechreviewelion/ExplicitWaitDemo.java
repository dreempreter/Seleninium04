package com.neotechreviewelion;

import java.nio.file.NoSuchFileException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	//https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html
	setUp();
	
	//implicit wait
	//Always done right after driver creation
	//Vaild throughout the driver lifetime
	driver.findElement(By.id("downloadButton")).click();
	
/*	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("downloadButton")).click();
	//driver.findElement(By.xpath("//div[text()='Complete!']"));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
	
	//Wait until the WebElement is visible
	
	WebElement label=driver.findElement(By.xpath("//div[text()='Complete!']"));
	System.out.println(label.getText());*/
	
FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
fluentWait.withTimeout(Duration.ofMinutes(1));
fluentWait.pollingEvery(Duration.ofSeconds(3));
fluentWait.ignoring(NoSuchFileException.class);

fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));

//Now we know the Close button is clickable
driver.findElement(By.xpath("//button[text()='Close']")).click();
	Thread.sleep(1000);

	tearDown();
	
	
	
}
}
