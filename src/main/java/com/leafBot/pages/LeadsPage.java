package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;




public class LeadsPage extends ProjectSpecificMethods {

	public LeadsPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//div[contains(@class,'header-buttons btn-group')]//a[1]")
	public WebElement eleLeadsbt;
	// Click Leads 
	public CreateLeadPage clickCreateLeads(){
		click(eleLeadsbt);
		return new CreateLeadPage(driver, node, test);
	}


}
