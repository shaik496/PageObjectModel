package com.orangeHrm.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHrm.pages.LoginPage;

public class LoginTest {
	WebDriver driver = null;

	@Test(priority = 1, enabled = true)
	public void validLogin() {
		LoginPage lp = new LoginPage();
		lp.LauchURL();
		String loginDashboard = lp.login("Admin", "admin123");
		Assert.assertEquals(loginDashboard, "Dashboard", "User not able to login to Application");
	}

}
