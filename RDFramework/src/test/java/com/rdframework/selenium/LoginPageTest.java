package com.rdframework.selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rdframework.selenium.objectrepositories.HomePage;
import com.rdframework.selenium.objectrepositories.LoginPage;

public class LoginPageTest extends Base {

	HomePage hp;
	LoginPage lp;
	@Test
	public void login() throws IOException {
	
		driver= initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		hp=new HomePage(driver);
		hp.signin().click();
		
		lp=new LoginPage(driver);
		lp.useremail().sendKeys("rsa");
		lp.userpassword().sendKeys("qwerty");
	}
}
