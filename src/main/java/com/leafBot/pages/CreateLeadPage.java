package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class CreateLeadPage extends ProjectSpecificMethods {


	public CreateLeadPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.XPATH,using="//select[@data-name='salutationName']")
	private WebElement selectSalName;

	public CreateLeadPage enterSalName(){
		selectDropDownUsingValue(selectSalName,"Mr.");	
		return this;

	}


	@FindBy(how=How.XPATH,using="//input[@autocomplete='espo-firstName']")
	private WebElement firstName;

	public CreateLeadPage enterFirstName(String name){
		clearAndType(firstName, name);
		return this;

	}
	
	@FindBy(how=How.XPATH,using="//input[@autocomplete='espo-lastName']")
	private WebElement lastName;

	public CreateLeadPage enterLastName(String name){
		clearAndType(lastName, name);
		return this;

	}

	@FindBy(how=How.XPATH,using="//button[text()='Save']")
	private WebElement eleSave;

	public ViewLeadPage clickSave(){
		click(eleSave);
		return new ViewLeadPage(driver, node, test);
	}

	
}
