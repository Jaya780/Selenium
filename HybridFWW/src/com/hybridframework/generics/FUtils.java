package com.hybridframework.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

/**
 *For File Utilization
 * @author kumaran.rmk
 *
 */
public class FUtils {
	/**
	 * Read the data from the Excel file
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 */

	public String read_XL_Data(String path,String sheet,int row,int cell)
	{
		String data="";
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
		/**
		 * Write the Data into Excel WorhSheet
		 * @param path
		 * @param sheet
		 * @param row
		 * @param cell
		 * @param data
		 */
		public  void  write_XL_Data(String path,String sheet,int row,int cell,String data)
		{
			
			try
			{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
			//save
			wb.write(new FileOutputStream(path));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			/**
			 * Count the number of Data rows in the Excel work sheet
			 * @param path
			 * @param sheet
			 * @return
			 */

		public int count_Row_Number(String path,String sheet)
		{
			int data=0;
			try
			{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			data=wb.getSheet(sheet).getLastRowNum();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return data;
		}
			
			/**
			 * Takes Screenshot use when test cases gets Fail
			 * @param driver
			 */
		public void takeScreenshot(WebDriver driver,String path)
		
		{
			try 
			{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				File des=new File(path);
				FileUtils.copyFile(src, des);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void verifyPage(WebDriver driver,String expectedTitle)
		{
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			Reporter.log("ThePage is verified-->"+expectedTitle,true);
		}
}
				
				
				
				
				
				
			
		


