package lesson10sabah;

import java.time.Duration;

import org.openqa.selenium.By;

import Utils.BaseClass;

public class HomeWork2 extends BaseClass{
public static void main(String[] args) {
	/*1) Open chrome browser
	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
	3) Login to the application
	4) Click on the checkbox of all orders with product FamilyAlbum
	5) Delete Selected orders
	6) Verify the orders have been deleted
	7) Quit the browser*/
	setUp();
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	
	
	
	
	tearDown();
}
}
