package com.pageobject.practicePOM;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class RediffLoginTest {
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;

	
	@Test
	public void a_openrediff() {
		driver.get("https://www.rediff.com/");
		
		if(!driver.getTitle().equals("Rediff.com: News | Rediffmail | 1Stock Quotes | Shopping"))
			Assert.assertTrue(false, "Incorrect Title, visible title is: "+driver.getTitle());
	}
	
	@Test
	public void b_signinlink() {
		homePage.signin().click();
	}
	
	@Test
	public void c_login() {
		loginPage.username().sendKeys("HelloRD");
		loginPage.password().sendKeys("QWERTY");
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);

	}

}
