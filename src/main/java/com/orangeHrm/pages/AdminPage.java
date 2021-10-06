package com.orangeHrm.pages;

import org.openqa.selenium.By;

import com.orageHrm.Utility.BaseClass;

public class AdminPage extends BaseClass{
	By userName = By.xpath("//input[contains(@id,'searchSystemUser_userName')]");
	By searcBtn = By.xpath("//input[contains(@id,'searchBtn')]");
	By adminMenu = By.xpath("//a[contains(@id,'menu_admin_viewAdminModule')]");
	By tableRecord = By.xpath("(//table[contains(@id,'resultTable')]//tr)[2]");
	public boolean searchUserByName(String UserName) {
		boolean status = false;
		driver.findElement(adminMenu).click();
		driver.findElement(userName).sendKeys(UserName);
		driver.findElement(searcBtn).click();
		status = driver.findElement(tableRecord).isDisplayed();
		return status;
	}
}
