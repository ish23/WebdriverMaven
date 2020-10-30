package com.IshMum.marketingManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.IshMum.base.TestBase;

public class LocateMarketingGrade extends TestBase {

	public static WebElement expand_shadow_element(WebElement element) {
		WebElement shadow_root = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot", element);
		return shadow_root;
	}

	@Test(priority = 5)
	public void navMarketing() throws Exception {

		WebElement root1 = driver.findElement(By.cssSelector(
				"body.vui-typography.d2l-typography.daylight:nth-child(2) nav.d2l-navigation-s.d2l-branding-navigation-dark-foreground-color.d2l-navigation-s-linkarea-no-color d2l-navigation-main-header:nth-child(1) div.d2l-navigation-header-right div.d2l-navigation-s-course-menu d2l-dropdown:nth-child(1) > d2l-navigation-button-notification-icon.d2l-dropdown-opener:nth-child(1)"));
		WebElement shadow_root1 = expand_shadow_element(root1);

		WebElement root2 = shadow_root1.findElement(By.cssSelector("d2l-navigation-button"));
		WebElement shadow_root2 = expand_shadow_element(root2);

		WebElement navButton = shadow_root2.findElement(By.cssSelector("button"));
		String js = "arguments[0].setAttribute('value','pdf')";
		((JavascriptExecutor) driver).executeScript(js, navButton);
		actions.moveToElement(navButton).click().perform();

		actions.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/html/body/header/nav/d2l-navigation/d2l-navigation-main-header/div[2]/div[1]/d2l-dropdown/d2l-dropdown-content/div/div/div[1]/div/ul/li[3]/div[1]/div/div/a"))))
				.click().perform();

	}

	@Test(priority = 6)
	public void clickGrades() throws Exception {

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(6) > .d2l-navigation-s-link"))).click();
		Thread.sleep(5000);
	}
}
