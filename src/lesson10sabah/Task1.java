package lesson10sabah;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;
import Utils.ConfigsReader;

public class Task1 extends BaseClass {
public static void main(String[] args) {
	/*
	 * TC 1: Disciplinary Cases Search Validation
	 * 
	 * Open chrome browser 
	 * Go to https://hrm.neotechacademy.com/ 
	 * Login into the application 
	 * Select Discipline 
	 * Select Disciplinary Cases 
	 * Click on Filter (Up-Right next to Help) 
	 * Select from January 6, 2023 to January 15, 2023 
	 * Click on Search 
	 * Validate that there are no rows in result table 
	 * Quit the browser
	 */

	setUp();
	//login to hrm page
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//login
	driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
	driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.xpath("menu_discipline_defaultDisciplinaryView")).click();
	driver.findElement(By.linkText("Disciplinary Cases")).click();
	
	//notice that there is a frame, move to the frame
	
	driver.switchTo().frame(0);
	//click on filter
	driver.findElement(By.id("searchModal")).click();
	driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom_table")).click();
	
	driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//li/span[text()='January']")).click();
	
	List<WebElement> dates = driver.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateTo_table']/tbody/tr/td"));
	
	for(WebElement date:dates)
	{
		if(date.getText().equals("6"))
		{
			date.click();
			break;
		}
	}
	
	//next data
	
	
	driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();
	driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//li/span[text()='January']")).click();
	
	
	
	
	tearDown();
	
	
	
	
	
	
	
}
}
