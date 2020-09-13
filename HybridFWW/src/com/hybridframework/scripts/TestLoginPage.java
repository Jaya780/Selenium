package com.hybridframework.scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hybridframework.generics.BaseTest;
import com.hybridframework.generics.FUtils;
import com.hybridframework.pages.EnterTimeTrackPage;
import com.hybridframework.pages.LoginPage;

public class TestLoginPage extends BaseTest{
@Test
public void test_ValidLoginPage() throws InterruptedException
{
	FUtils tc=new FUtils();
//	String un=tc.read_XL_Data("ValisLoginPage",1,0);
//	String pw=tc.read_XL_Data("ValisLoginPage",1,1);
	String etitle = tc.read_XL_Data(XL_DATA_PATH,"ValidLoginPage",1,2);
	
	
	LoginPage lp=new LoginPage(driver);
	lp.login();
	Thread.sleep(1000);
	//300 testCase  remember so use 
	EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
	etp.verifyETP(driver,"actiTIME - Enter Time-Track");
	Thread.sleep(1000);
	etp.clickOnLogout();
}

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
	Object[][] s=new Object[3][2];//[]how many data ready to ,no of iteration,[][]how many data ready to receive
	
	s[0][1]="QSP";
	s[0][1]="JSP";
	
	s[1][0]="6778";
	s[1][1]="0566767";
	
	s[2][0]="$^&**";
	s[2][1]="4556662@";
	return s;

}

}
