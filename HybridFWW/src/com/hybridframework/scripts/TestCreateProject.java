package com.hybridframework.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.hybridframework.generics.BaseTest;
import com.hybridframework.pages.EnterTimeTrackPage;
import com.hybridframework.pages.LoginPage;
import com.hybridframework.pages.TaskListPage;

public class TestCreateProject extends BaseTest {
	@Test
	public void test_CreateProjectModule() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login();
		Thread.sleep(1000);
		
		EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
		etp.verifyETP(driver,"actiTIME - Enter Time-Track");
		etp.clickOnTaskListTab();
		
		TaskListPage tsp=new TaskListPage(driver);
		tsp.verifyTLP(driver,"actiTIME - Task List");
		tsp.clickOnAddNewBTN();
		tsp.clicOnCreateNewProject();		
		tsp.setProjectName("Test-Opt12234");
		tsp.clickOnListBox();
		Thread.sleep(1000);
		tsp.selectCustomerInList("QSP");
		Thread.sleep(1000);
		tsp.clickOnCreateProject();
		
	}

	
	


	//	tsp.listBOX();
////	Select sel=new Select(null);
////	sel.selectByVisibleText("jaya");
////	System.out.println(sel.isMultiple());
////	Thread.sleep(1000);
////	sel.selectByIndex(0);
//	tsp.selectCustomerInList("QQSP");
//	Thread.sleep(1000);
//	tsp.clickOnListBox();
//	tsp.createPROBTN();
//	Thread.sleep(1000);
//	tsp.verifyProjectCreated();
//	Thread.sleep(1000);
//	tsp.clickOnLogout();
//	
//	
}

	
	
	
	



