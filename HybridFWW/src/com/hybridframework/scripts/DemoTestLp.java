package com.hybridframework.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hybridframework.pages.LoginPage;

public class DemoTestLp {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void validLoginPage(String url,String un,String pw)
{

		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		//Maximize the Browser
		driver.manage().window().maximize();
		driver.get(url);
		
		
//		WebElement unTB = driver.findElement(By.name("username"));
//		unTB.sendKeys(un);
//		
//		WebElement pwdTB = driver.findElement(By.name("pwd"));
//		pwdTB.sendKeys(pw);
//		
//		WebElement lgnBTN = driver.findElement(By.xpath("//div[text()='Login ']"));
//		lgnBTN.click();

	}
public static void invalidLoginPage(String url,String un,String pw)
{

		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		//Maximize the Browser
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement unTB = driver.findElement(By.name("username"));
		unTB.sendKeys(un);
		
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		pwdTB.sendKeys(pw);
		
		WebElement lgnBTN = driver.findElement(By.xpath("//div[text()='Login ']"));
		lgnBTN.click();

	}
public static void main(String[] args) {
	validLoginPage("http://localhost/login.do","admin","manager");
	invalidLoginPage("http://localhost/login.do","admin1","manager1");
}

}
