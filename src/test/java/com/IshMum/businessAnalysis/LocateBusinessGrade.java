package com.IshMum.businessAnalysis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import com.IshMum.base.TestBase;


public class LocateBusinessGrade extends TestBase {

	public static WebElement expand_shadow_element(WebElement element) {
		WebElement shadow_root = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot", element);
		return shadow_root;
	}

	@Test(priority = 2)
	public void getBusinessAnalysis() throws InterruptedException {
		Thread.sleep(2500);
		WebElement root1 = driver.findElement(By.xpath(
				obref.getProperty("root1")));
		WebElement shadow_root1 = expand_shadow_element(root1);

		WebElement root2 = shadow_root1.findElement(By.cssSelector(obref.getProperty("root2")));
		WebElement shadow_root2 = expand_shadow_element(root2);

		WebElement root3 = shadow_root2.findElement(By.cssSelector(obref.getProperty("root3")));
		WebElement shadow_root3 = expand_shadow_element(root3);

		WebElement root4 = shadow_root3.findElement(By.cssSelector(obref.getProperty("root4")));
		WebElement shadow_root4 = expand_shadow_element(root4);

		WebElement businessButton = shadow_root4.findElement(By.cssSelector(
				obref.getProperty("businessButton")));
		String js = "arguments[0].setAttribute('value','pdf')";
		((JavascriptExecutor) driver).executeScript(js, businessButton);

		actions.moveToElement(businessButton).click().perform();

	}

	@Test(priority = 3)
	public void clickGrades() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				obref.getProperty("gradesTab"))))
				.click();

	}

}