package com.rushi.rushiudemy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8WebTables {

	public static void main(String[] args) throws InterruptedException {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// navigate to qaclickacademy practice page
		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement table=driver.findElement(By.id("product"));
		
		int rowsCount=table.findElements(By.tagName("tr")).size();
		System.out.println("Total No. of rows in the table are: "+rowsCount);
	
		WebElement desired =table.findElement(By.xpath("tbody/child::tr[3]"));
	
		for(int i=0; i<desired.findElements(By.tagName("td")).size();i++){
			System.out.println(desired.findElements(By.tagName("td")).get(i).getText());
		}
	}

}
