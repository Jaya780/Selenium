package com.hybridframework.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hybridframework.generics.BaseTest;
import com.hybridframework.pages.EnterTimeTrackPage;
import com.hybridframework.pages.LoginPage;

public class DemoTestLp2 extends BaseTest {
	
@Test(priority=0) 									 //rule testmethod last put test
public static void validLoginPage_test() throws InterruptedException
{

		LoginPage lp=new LoginPage(driver);
		lp.login();
		Thread.sleep(1000);
		EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
		etp.clickOnLogout();
}
@Test(priority=1)
public static void invalidLoginPage(String url)
{

		LoginPage lp=new LoginPage(driver);
		lp.login("admin11","manager");


}

}
