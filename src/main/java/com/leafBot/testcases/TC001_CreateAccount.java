package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateAccount extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "CreateAccount";
		testDescription = "Creating New Accounts";
		nodes = "Leads";
		authors = "TestLeaf";
		category = "Smoke";
		dataSheetName = "TC001_CreateAccount";
	}

	@Test(dataProvider = "fetchData")
	public void createAcc(String name, String vName) throws InterruptedException {
		new LoginPage(driver, node, test)
		.clickUsername()
		.clickPassword()
		.clickLogin()
		.clickAccounts()
		.clickCreateAccount()
		.enterName(name)
		.clickSave()
		.verifyName(vName);
			
	}


}





