package com.hybridframework.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	public void customWait(WebDriver driver, WebElement element)
	{
		new WebDriverWait(driver,IAutoConstant.ETO)
		.until(ExpectedConditions.elementToBeClickable(element));
	}
	
public void customWait(WebDriver driver,String eTitle)
{
	new WebDriverWait(driver,IAutoConstant.ETO)
	.until(ExpectedConditions.titleContains(eTitle));
	
}
public void selectelement(WebElement elem,String vtext)
{
	new Select(elem).selectByVisibleText(vtext);
}
public void selectelement(WebElement elem,int index)
{
	new Select(elem).deselectByIndex(index);
}
public void handleframebyIndex(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}
public void handleframebyWebelement(WebDriver driver,WebElement elem)
{
	driver.switchTo().frame(elem);
}
public void mouseActions(WebDriver driver,WebElement targetelem)
{
	new Actions(driver).moveToElement(targetelem).perform();
}
}
