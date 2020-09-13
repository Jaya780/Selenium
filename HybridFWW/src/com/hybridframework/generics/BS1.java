
	package com.hybridframework.generics;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

	public class BS1 implements IAutoConstant
	{
		
		static
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			System.setProperty(GECKO_KEY,GECKO_VALUE);
		}
		
		public static int passCount=0,failCount=0;
		public static WebDriver driver;
		
		public FUtils tc=new FUtils();
		@BeforeClass
		@Parameters("sBrowser")
		public void openBrowser(String sBrowser)
		{
			if(sBrowser.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(sBrowser.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(sBrowser.equals("ie"))
			{
				driver=new InternetExplorerDriver();
			}
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(URL);
		}
		


		@AfterClass
		public void closeApp()
		{
			driver.close();
		}


	}

