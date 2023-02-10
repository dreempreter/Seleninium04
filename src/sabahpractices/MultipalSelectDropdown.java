package sabahpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BaseClass;

public class MultipalSelectDropdown extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	WebElement multiSelect = driver.findElement(By.id("countriesMultiple"));
	
	//create a select object
	
	Select sel = new Select(multiSelect);
	
	//check if the dropdown allows multiple selections
	
	boolean isMlp = sel.isMultiple();
	System.out.println("Is this multiple selections? " + isMlp);
	
	if(isMlp)
	{
		List<WebElement> options= sel.getOptions();
		
		for(WebElement we : options)
		{
			String text = we.getText();
			System.out.println("The visible text value: " + text);
			sel.selectByVisibleText(text);
			Thread.sleep(3000);
		}
		
		sel.deselectByIndex(0);
		Thread.sleep(3000);
	}
	
	
	
	
	tearDown();
	
	
	
}
}
