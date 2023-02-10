package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseClass;

public class Task1 extends BaseClass {
	public static void main(String[] args) {

		setUp();

		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody"));

		String expected = "Financial Center";
		String actual = table.getText();
		System.out.println(actual);
		if (actual.contains(expected)) {
			System.out.println(expected + " is in the table. Test is passed ! ");
		} else {
			System.out.println(expected + " is not in the table. Test is failed! ");
		}

		System.out.println("===========All Column Headrer===========");

		List<WebElement> headerData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));

		for (WebElement data : headerData) {
			System.out.println(data.getText() + " | ");

		}

		System.out.println();
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		for (WebElement data : rowData) {
			System.out.println(data.getText() + " ");
		}

		tearDown();

	}

}