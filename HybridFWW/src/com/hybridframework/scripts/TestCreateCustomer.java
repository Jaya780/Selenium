package com.hybridframework.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.hybridframework.generics.BaseTest;
import com.hybridframework.pages.EnterTimeTrackPage;
import com.hybridframework.pages.LoginPage;
import com.hybridframework.pages.TaskListPage;

public class TestCreateCustomer extends BaseTest {
	@Test
	public void test_CreateCustomerModule() throws InterruptedException
	{
		LoginPage lp =new LoginPage(driver);
		lp.login();
		Thread.sleep(1000);
		EnterTimeTrackPage etp= new EnterTimeTrackPage(driver);
		etp.verifyETP(driver,"actiTIME - Enter Time-Track");
		etp.clickOnTaskListTab();
		Thread.sleep(1000);
		TaskListPage tsp=new TaskListPage(driver);
		tsp.verifyTLP(driver,"actiTIME - Task List");
		tsp.clickOnAddNewBTN();
		Thread.sleep(1000);
		tsp.clickOnCreateNewCustomer();
		tsp.setCustomerName("JBC1122");
		Thread.sleep(1000);
		tsp.clicOnCreateNewCustomerBTN();
	}
	
	

	
}

