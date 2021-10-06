package com.orageHrm.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	protected WebDriver driver = null;

	public BaseClass() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Meeravali_Workspace\\Learning\\CucumberFramewrok\\Lib\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-extensions");
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-javascript");
			chromeOptions.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(chromeOptions);
		}
		
	}
}
