package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class ViewLeadPage extends ProjectSpecificMethods  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.XPATH,using="//div[@data-name='name']//div[1]")
	public WebElement eleName;
	public ViewLeadPage verifySalName(String name) throws InterruptedException {
		Thread.sleep(2000);
		verifyPartialText(eleName, name);
		return this;
	}
	
	
	

	
	
}
