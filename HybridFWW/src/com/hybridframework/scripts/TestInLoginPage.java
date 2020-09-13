package com.hybridframework.scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hybridframework.generics.BS1;
import com.hybridframework.pages.LoginPage;

public class TestInLoginPage extends BS1{
	@Test(dataProvider="testWithInvalidData")
	public void test_InvalidLoginPage(String un,String pw) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(un, pw);
		Thread.sleep(1000);
		lp.verifyErrMSG();
	}
	
	@DataProvider
	public Object[][] testWithInvalidData()
	{
		Object[][] s=new Object[3][2];
		
		s[0][0]="QSP";
		s[0][1]="JSP";
		
		s[1][0]="6778";
		s[1][1]="09897665";
		
		s[2][0]="*&^^%$$";
		s[2][1]=")((*&^  ";
		
		return s;
}
}
