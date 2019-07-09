package com.w2a.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;
import org.openqa.selenium.Alert;

public class AddCustomerTest extends TestBase {
	
	
	@Test(dataProvider="getData")
	public void addCustomer(String firstName, String lastName, String postCode, String alerttext) throws InterruptedException{
		
		
		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("firstName"))).sendKeys(firstName);
		driver.findElement(By.cssSelector(OR.getProperty("lastName"))).sendKeys(lastName);
		driver.findElement(By.cssSelector(OR.getProperty("postCode"))).sendKeys(postCode);
		driver.findElement(By.cssSelector(OR.getProperty("addBtn"))).click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		Thread.sleep(3000);
		Assert.assertFalse(alert.getText().contains("alerttext"));
		
		 Thread.sleep(3000);
		 alert.accept();
		 Thread.sleep(3000);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		String sheetName = "AddCustomerTest";
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
		
		System.out.println(excel.getCellData(sheetName, 0, 2));
		
		System.out.println(excel.getCellData(sheetName, 1, 2));
		 
		Object[][] data = new Object[rowNum - 1][colNum];
 
		for (int rows = 2; rows <= rowNum; rows++) {
 
			for (int cols = 0; cols < colNum; cols++) {
				
				data[rows - 2][cols] = excel.getCellData(sheetName, cols, rows);
			}
			
			
		}
		
		return data;
		
	}

}
