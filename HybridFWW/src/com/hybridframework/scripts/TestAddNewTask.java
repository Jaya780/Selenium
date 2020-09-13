package com.hybridframework.scripts;

import org.testng.annotations.Test;

import com.hybridframework.generics.BaseTest;
import com.hybridframework.pages.EnterTimeTrackPage;
import com.hybridframework.pages.LoginPage;

public class TestAddNewTask extends BaseTest {
	@Test
	public void test_addNewTask() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login();
		//every time use title, so use data driven
		EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
		etp.verifyETP(driver,"aciTIME - Enter Time-Track");
		etp.clickOnTaskListTab();
		
	}
}
