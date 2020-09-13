package com.hybridframework.pages;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
//POM class shared one,everyone should understand to use other TestEngineer also
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.hybridframework.generics.WebDriverUtils;

public class TaskListPage extends WebDriverUtils {
WebDriver driver;
	
	public TaskListPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		this.driver = driver; 
	}
	
	@FindBy(xpath="//div[text()='Add New']/ancestor::div[@class='addNewButton']")
	private WebElement addNewBTN;
	
	@FindBy(xpath="//div[text()='Add New Task']/ancestor::div[@class='addNewButton']")
    private WebElement addNewTaskBTN;
	
	@FindBy(xpath="//div[contains(text(),'+ New Customer')]")
    private WebElement createNewCustomer;
	
	@FindBy(xpath="//span[text()='Create Customer']/ancestor::div[@class='buttonIcon']")
    private WebElement createNewCustomerBTN;
	
	@FindBy(xpath="//div[contains(text(),'+ New Project')]")
    private WebElement createNewProject;
	
	@FindBy(xpath="//div[contains(text(),'Create new tasks')]")
	private WebElement creteNewTask;
	
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement enterPNTB;
	
	@FindBy(xpath="//button[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement selectCustomerlist;
	
	@FindBy(id="projectPopup_commitBtn")
	private WebElement createProjectBTN;
	
	@FindBy(xpath="//a[@class='x-menu-item']")
	private List<WebElement> lists;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement entercustomerNameTB;
	
	@FindBy(id="ext-comp-1158")
	private WebElement selectCustomerForTask;
	
	@FindBy(id="ext-gen413")
	private WebElement selectProjectForTask;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
	private List<WebElement> entertaskTB;	
	
	@FindBy(id="createTasksPopup_customerSelector")
	private WebElement selectCLB;
	
	@FindBy(id="createTasksPopup_projectSelector")
	private WebElement selectPLB;
	
	@FindBy(xpath="//a[@class='x-menu-item']")
	private List<WebElement> custNameTL;
	
	@FindBy(xpath="//a[@class='x-menu-item']")
	private List<WebElement> projectNameTL;
	
	@FindBy(xpath="//span[text()='Create Tasks']/ancestor::div[@id='createTasksPopup_commitBtn']")
	private WebElement createTaskBTN;	
	
	
	
	public void clickOnAddNewBTN()
	{
		customWait(driver, addNewBTN);
		addNewBTN.click();
	}
	public void clickOnAddNewTask()
	{
		customWait(driver, addNewTaskBTN);
		addNewTaskBTN.click();
	}
	
	public void clickOnCreateNewCustomer()
	{
		customWait(driver, createNewCustomer);
		createNewCustomer.click();
	}
	
	public void clicOnCreateNewProject()
	{
		createNewProject.click();
	}
	
	public void clicOnCreateNewCustomerBTN()
	{
		customWait(driver, createNewCustomerBTN);
		createNewCustomerBTN.click();
	}
	
	public void clicOnCreateNewTask()
	{
		
		creteNewTask.click();
	}

	public void verifyTLP(WebDriver driver,String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		Reporter.log("The Expected Page Is Displayed--->"+expectedTitle,true);
	}
	
	public void setProjectName(String pn)
	{
		enterPNTB.sendKeys(pn);
	}
	public void setCustomerName(String cn)
	{
		entercustomerNameTB.sendKeys(cn);
	}
	public void clickOnListBox()
	{
		customWait(driver,selectCustomerlist);
		selectCustomerlist.click();
	}
	
	public void clickOnCustomerListBox()
	{
		selectCLB.click();
	}
	
	public void clickOnProjectListBox()
	{
		selectPLB.click();
	}
	
	public void selectCustomerInList(String cn)
	{
		for(WebElement l:lists)
		{
			String s = l.getText();
			System.out.println(s);
			if(s.equals(cn))
			{
				l.click();
				break;
			}
		}
	}
	
	public void clickOnCreateProject()
	{
		createProjectBTN.click();
	}
	
	public void selectCustomerNameTask(String cn)
	{
		for(WebElement cl:custNameTL)
		{
			String s = cl.getText();
			System.out.println(s);
			if(s.equals(cn))
			{
				cl.click();
				break;
			}
		}
		
	}
	public void selectProjectNameTask(String pn)
	{
		for(WebElement pl:projectNameTL)
		{
			String s = pl.getText();
			System.out.println(s);
			if(s.equals(pn))
			{
				pl.click();
				break;
			}
		}
	}
	
	public void enterTaskName(ArrayList<String> ls)
	{
		Random ran  = new Random();
		int randomNum = ran.nextInt(1000);

		int index = 0; 
		for(WebElement tb:entertaskTB)
		 {
			// randomNum = ran.nextInt(1000);
			//task.sendKeys(ls.get(4) +"_"+randomNum);
			tb.sendKeys(ls.get(index)+"_"+randomNum);
			index++;
			
		}
		
	}
	
	public void clickonCreateTask()
	{
		createTaskBTN.click();
		
	}
}
