package lesson10sabah;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class Homework1 extends BaseClass{
//	TC: Update Customer Information
//
//	1) Open chrome browser
//	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	3) Login to the application
//	4) Verify customer "Susan McLaren" is present in the table
//	5) Click on customer details
//	6) Update customers last name and credit card info
//	7) Verify updated customers name and credit card number is displayed in table
//8) Close browser
	
public static void main(String[] args) {
	
	setUp();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	
	for(int i = 1; i<rows.size(); i++)
	{
		String rowText = rows.get(i).getText();
		if(rowText.contains("Susan McLaren"))
		{
			System.out.println("Susan found !!! ");
			System.out.println(i + " ");
			
			String path = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + i + 1+ "]/td[13]";
			driver.findElement(By.xpath(path));
			break;
		}
	}
	
	
	
	
	tearDown();
	
	
	
	
}
}
