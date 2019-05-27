package com.rdframework.selenium;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestLaunch extends Base {

	@Test
	public void launch() throws IOException {
		driver = initializeDriver();
		
		driver.get("http://qaclickacademy.com");
	}
}
