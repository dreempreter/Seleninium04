package lesson10sabah;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class Calendar extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	//click on the calendar
	
	driver.findElement(By.xpath("//span[@id=\"calDepartLabelCont\"]/span[2]")).click();
	String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
	
	
	//loop until we see the month we want
	
	while(!month.equals("April"))
	{
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
	}
	
	
	//lets get all the cells, and only the date we want (25)
	
	List<WebElement> days= driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
	//iterate and find the date
	
	for(WebElement day: days)
	{
		String dayNum=day.getText();
		if(dayNum.equals("25"))
		{
			day.click();
			break;
		}
	}
	
	Thread.sleep(2000);
	
	//return month
	String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
	while(!returnMonth.equals("June"))
	{

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
	}
	
	//iterate and select day 5 June as return
	List<WebElement> returnDays= driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
	for(WebElement day: returnDays)
	{
		String dayNum = day.getText();
		if(dayNum.equals("5"))
		{
			day.click();
			break;
		}
		
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@value='done']")).click();
	Thread.sleep(2000);
	
	
	
	
	tearDown();
	
	
	
	
	
}
}
