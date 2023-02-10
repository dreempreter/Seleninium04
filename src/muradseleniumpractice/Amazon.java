package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BaseClass;

public class Amazon extends BaseClass{
//	Amazon Department List Verification
////  Open chrome browser
////  Go to "http://amazon.com/"
////  Verify how many department options available.
////  Print each department 
////  Select Computers
////  Quit browser
	public static void main(String[] args) {
		
		
		setUp();
		WebElement Alloptions=driver.findElement(By.id("searchDropdownBox"));
		Alloptions.click();
	
		
		tearDown();
	}
}
