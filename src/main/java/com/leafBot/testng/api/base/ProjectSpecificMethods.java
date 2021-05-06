package com.leafBot.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leafBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;


public class ProjectSpecificMethods extends SeleniumBase {

	public static String dataSheetName;		

	@DataProvider(name = "fetchData" /* ,indices=1*/)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(dataSheetName);
	}	

	@BeforeMethod
	public void beforeMethod() {
		driver = startApp("chrome", "http://13.126.53.44/EspoCRM-5.8.2/");
		node = test.createNode(testCaseName);
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}













}
