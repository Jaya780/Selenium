package com.hybridframework.scripts;

import org.testng.annotations.Test;

import com.hybridframework.generics.BaseTest;
import com.hybridframework.pages.EnterTimeTrackPage;
import com.hybridframework.pages.LicensesPage;
import com.hybridframework.pages.LoginPage;

public class TestLicenses extends BaseTest
{
	@Test
	public void test_IssuDate() throws InterruptedException
	{	
	String eTitleETP=tc.read_XL_Data(XL_DATA_PATH,"IssuDate",1,2);
	String eTitleLCP=tc.read_XL_Data(XL_DATA_PATH,"IssueDate",1,3);
	String expectedIssueDate = tc.read_XL_Data(XL_DATA_PATH,"IssueDate",1,4);
	LoginPage lp=new LoginPage(driver);
	lp.login();
	Thread.sleep(1000);
	EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
	etp.verifyETP(driver,eTitleETP);
	Thread.sleep(1000);
	etp.clickOnSetting();
	Thread.sleep(1000);
	etp.clickOnLicenses();
	
	
	LicensesPage lcp=new LicensesPage(driver);
	Thread.sleep(1000);
	tc.verifyPage(driver, eTitleLCP);
	lcp.verifyIssueDate(expectedIssueDate);
	
	}
	@Test
	public void test_ProductEdition() throws InterruptedException
	{	
	String eTitleETP=tc.read_XL_Data(XL_DATA_PATH,"ProductEdition",1,2);
	String eTitleLCP=tc.read_XL_Data(XL_DATA_PATH,"ProductEdition",1,3);
	String expectedProductEdition = tc.read_XL_Data(XL_DATA_PATH,"ProductEdition",1,4);
	LoginPage lp=new LoginPage(driver);
	lp.login();
	Thread.sleep(1000);
	EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
	Thread.sleep(1000);
	etp.verifyETP(driver,eTitleETP);
	Thread.sleep(1000);
	etp.clickOnSetting();
	Thread.sleep(1000);
	etp.clickOnLicenses();
	
	
	LicensesPage lcp=new LicensesPage(driver);
	tc.verifyPage(driver, eTitleLCP);
	Thread.sleep(1000);
	lcp.verifyLCP(driver,expectedProductEdition);
	
	}
}
