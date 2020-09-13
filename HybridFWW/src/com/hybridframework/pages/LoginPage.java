package com.hybridframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(id="keepLoggedInCheckBox")////never change constant
	private WebElement chkBox;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid.']")
	private WebElement errMSG;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//i initaialise eleent with the help of initElement
												//page get refresh,lasy binding concept i use it PageFactory
	}
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickonCheckBox()
	{
		chkBox.click();
	}
	public void clickOnLogin()
	{
		lgnBTN.click();
	}
	public void login()
	{
		unTB.sendKeys("admin");
		pwTB.sendKeys("manager");
		chkBox.click();
		lgnBTN.click();
	}
	
	public void login(String un,String pw)
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
		chkBox.click();
		lgnBTN.click();
	}
	//u modify working directory it reflect to everyOne,so use version control
	public void verifyErrMSG()
	{
	Assert.assertTrue(errMSG.isDisplayed());	
	Reporter.log("the ErrMsg is Displayed-->"+errMSG.getText());
	}
}
//achieve method overloading,compile-time polymorphism
//PageFacotry is used to initalize the web element in the current page