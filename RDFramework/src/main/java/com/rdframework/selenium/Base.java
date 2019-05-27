package com.rdframework.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");

		pro.load(fis);
		String browsername = pro.getProperty("browser");

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("chrome")) {

			System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("chrome")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
