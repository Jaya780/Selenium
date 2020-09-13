package com.hybridframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.hybridframework.generics.WebDriverUtils;

public class EnterTimeTrackPage extends WebDriverUtils {
	//@FindBy(xpath="//div[text()='TASKS']/parent::a[@class='content tasks']")
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskListTab;
	@FindBy(xpath="//a[text()='Licenses']")
	private WebElement licenses;
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private WebElement settings;
	@FindBy(id="logoutLink")
	private WebElement lgOutBTN;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickOnSetting()
	{
		settings.click();
	}
	public void clickOnLicenses()
	{
		licenses.click();
	}
	public void clickOnLogout()
	{
		lgOutBTN.click();
	}
	public void clickOnTaskListTab()
	{
		taskListTab.click();
	}
	public void verifyETP(WebDriver driver,String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("The Expected page is Displayed"+expectedTitle,true);
		
	}

}
