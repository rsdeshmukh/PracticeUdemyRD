package com.rdframework.selenium.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_email")
	WebElement useremail;

	@FindBy(id = "user_password")
	WebElement userpassword;

	public WebElement useremail() {
		return useremail;
	}

	public WebElement userpassword() {
		return userpassword;
	}

}
