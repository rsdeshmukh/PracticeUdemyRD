package com.rdframework.selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rdframework.selenium.objectrepositories.HomePage;

public class HomePageTest extends Base {

	HomePage hp;

	@Test
	public void f() throws IOException {
	
		driver= initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		hp=new HomePage(driver);
		
		hp.signin().click();
	}
}
