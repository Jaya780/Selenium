package com.hybridframework.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.hybridframework.pages.EnterTimeTrackPage;

//Basic class i am testing the application so use BaseTest
public class BaseTest implements IAutoConstant {
	static //it use to set the driver executable part
	{
System.setProperty(CHROME_KEY, CHROME_VALUE);
System.setProperty(GECKO_KEY,GECKO_VALUE);

		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//System.setProperty(IE_KEY, IE_VALUE);
	}
	public static int passCount=0,failCount=0;
	public static WebDriver driver;//global variable
	public FUtils tc=new FUtils();
			
	@BeforeClass  //before class annotation
	@Parameters("sBrowser")
	public static void openApplication(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
			
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get(URL);
	}
	@BeforeMethod
	public void openApp()
	{
		driver.get(URL);
	}
	
	
	@AfterMethod
	public void logOutAPP(ITestResult res) //this class describe result of test,one of the testNG listeners
	{
//		EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
//		etp.clickOnLogout();//except invalid work for all
		int testStatus = res.getStatus();//
		String nametest = res.getName();//get name of testCase and store it in nameTest variable
		if(testStatus==1)
		{
			passCount++;
			
		}
		else
		{
			failCount++;
			String ppath=PHOTO_PATH+nametest+".png";//get name of the testCase (fail)
			tc.takeScreenshot(driver,PATH);
		}
	}
	@AfterClass
	public static void closeApplication()
	{
		driver.close();
	}

}
