package com.hybridframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LicensesPage {
	@FindBy(xpath="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement issueDate;
	
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement productEdition;
	
	public LicensesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyIssueDate(String expectedIssueDate)
	{
		String actualIssueDate=issueDate.getText();
		Assert.assertEquals(actualIssueDate,expectedIssueDate);
		Reporter.log("Issuedate is verify"+expectedIssueDate,true);
	}
	public void verifyProductEdition(String expectedProductEdition)
	{
		String actualProductEdition=productEdition.getText();
		Assert.assertEquals(actualProductEdition,expectedProductEdition);
		Reporter.log("Issuedate is verify"+expectedProductEdition,true);
	}
	public void verifyLCP(WebDriver driver,String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Verify LCP page"+expectedTitle,true);
	}
	
	//get the WebElement text-getText()
	//get the current WebPage title-getTitle()
	
	
}
