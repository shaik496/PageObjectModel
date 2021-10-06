package com.orangeHrm.pages;

import org.openqa.selenium.By;

import com.orageHrm.Utility.BaseClass;

public class LoginPage extends BaseClass {

	By userName = By.xpath("//input[contains(@id,'txtUsername')]");
	By passWord = By.xpath("//input[contains(@id,'txtPassword')]");
	By button = By.xpath("//input[contains(@id,'btnLogin')]");
	By dashboard = By.xpath("//*[@id='content']/div/div[1]/h1");

	public void LauchURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public String login(String uname, String password) {
		String dashbordString = null;
		driver.findElement(userName).sendKeys(uname);
		driver.findElement(passWord).sendKeys(password);
		driver.findElement(button).click();
		dashbordString = driver.findElement(dashboard).getText();
		return dashbordString;
	}

}
