package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(RemoteWebDriver driver, ExtentTest node, ExtentTest test) {
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@title='Accounts']")
	public WebElement eleAccounts;
	public AccountsPage clickAccounts() {
		click(eleAccounts);
		return new AccountsPage(driver, node, test);
	}


	@FindBy(how = How.XPATH, using = "//span[@title='Leads']")
	public WebElement eleLeads;

	public LeadsPage clickLeads() {	
		click(eleLeads);
		return new LeadsPage(driver, node, test);
	}




}
