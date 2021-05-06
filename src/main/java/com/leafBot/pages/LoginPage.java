package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test) {
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "field-userName")
	public WebElement username;
	
	public LoginPage clickUsername() {
		clearAndType(username, "admin");
		return this;
	}

	@FindBy(how = How.ID, using = "field-password")
	public WebElement password;

	public LoginPage clickPassword() {
		clearAndType(password, "Rabbit*123");
		return this;
	}

	@FindBy(how = How.ID, using = "btn-login")
	public WebElement eleLogin;

	@Given("Click on the Login")
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage(driver, node, test);
	}
}
