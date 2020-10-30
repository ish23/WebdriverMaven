package com.IshMum.businessAnalysis;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.IshMum.base.TestBase;

public class LoginTest extends TestBase {

	@Test(priority = 1)
	public void doLogin() throws InterruptedException {
		driver.get(obref.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obref.getProperty("campusIDLoginButton"))))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obref.getProperty("usernameBox"))))
				.sendKeys(obref.getProperty("username"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obref.getProperty("passwordBox"))))
				.sendKeys(obref.getProperty("password"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obref.getProperty("loginButton")))).click();
		

	}
}
