package com.practice.seleniumConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_HandlingInputs {

	public static void main (String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		driver.findElementById("fullName").sendKeys("entering full name");
		
		//Append a text and press keyboard tab
		
		driver.findElementByClassName("input").sendKeys(" appending");
		
		
		// quit
		driver.quit();
		
	}
	
	
}
