package com.rdframework.selenium.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@href,'sign_in')]")
	WebElement signinlink;
	
	
	public WebElement signin() {
		return signinlink;
	}
	
	
	
}
