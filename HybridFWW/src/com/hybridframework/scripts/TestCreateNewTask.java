package com.hybridframework.scripts;

import org.testng.annotations.Test;

import com.hybridframework.generics.BaseTest;
import com.hybridframework.pages.EnterTimeTrackPage;
import com.hybridframework.pages.LoginPage;
import com.hybridframework.pages.TaskListPage;

public class TestCreateNewTask extends BaseTest{
	@Test
	public void test_CreateTaskModule() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login();
		Thread.sleep(1000);
		
		EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
		etp.verifyETP(driver,"actiTIME - Enter Time-Track");
		etp.clickOnTaskListTab();
		
		TaskListPage tsp=new TaskListPage(driver);
		tsp.verifyTLP(driver,"actiTIME - Task List");
		tsp.clickOnAddNewTask();
		tsp.clicOnCreateNewTask();
		Thread.sleep(1000);
		tsp.clickOnCustomerListBox();
		Thread.sleep(1000);
		tsp.selectCustomerNameTask("QSP");
		tsp.clickOnProjectListBox();	
		Thread.sleep(1000);
		tsp.selectProjectNameTask("TestLamda");
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("CRS");
		al.add("ART");
		al.add("Coding");
		al.add("Testing");
		al.add("UAT");
		
		tsp.enterTaskName(al);
		tsp.clickonCreateTask();
		
	}
}

