package com.orangeHrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHrm.pages.AdminPage;
import com.orangeHrm.pages.LoginPage;

public class AdminTests {
	@Test(priority = 1, enabled = true)
	public void checkUser() {
		LoginPage lp = new LoginPage();
		lp.LauchURL();
		lp.login("Admin", "admin123");
		AdminPage adminPage = new AdminPage();
		boolean valu = adminPage.searchUserByName("Admin");
		Assert.assertEquals(valu, true, "Expected user is not present on UI");

	}
}
