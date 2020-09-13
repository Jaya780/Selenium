package com.hybridframework.scripts;

import org.testng.annotations.Test;

import com.hybridframework.generics.BaseTest;
import com.hybridframework.pages.EnterTimeTrackPage;
import com.hybridframework.pages.LoginPage;

public class TestLoginPage1 extends BaseTest {
	@Test
	public void test_ValidLoginPage() throws InterruptedException 
	{
		
//		String un = tc.read_XL_Data("ValidLoginPage",1,0);
//		String pw = tc.read_XL_Data("ValidLoginPage",1,1);
		String etitle = tc.read_XL_Data(XL_DATA_PATH,"ValidLoginPage",1,2);
	
		LoginPage lp=new LoginPage(driver);
		lp.login();
		Thread.sleep(1000);
		EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
		tc.verifyPage(driver,etitle);
		
	}

}
