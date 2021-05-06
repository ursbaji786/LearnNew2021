package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class CreateAccountPage extends ProjectSpecificMethods {


	public CreateAccountPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);		
	}


	@FindBy(how=How.XPATH,using="//input[@autocomplete='espo-name']")
	private WebElement accountName;

	public CreateAccountPage enterName(String name){
		clearAndType(accountName, name);
		return this;

	}

	@FindBy(how=How.XPATH,using="//button[text()='Save']")
	private WebElement eleSave;

	public ViewAccountPage clickSave(){
		click(eleSave);
		return new ViewAccountPage(driver, node, test);
	}

	
}
