package webdriverMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	public static Actions actions;
	public static WebDriverWait wait;

	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 1);
	}

	@Test(priority = 1)
	public void doLogin() throws InterruptedException {
		driver.get("https://gastate.view.usg.edu/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/html/body/div[@role='main']/div[@class='d2l-page-main-padding']//a[@href='https://gastate.view.usg.edu/Shibboleth.sso/Login?entityID=https://idp.gsu.edu/idp/shibboleth&target=https%3A%2F%2Fgastate.view.usg.edu%2Fd2l%2FshibbolethSSO%2Flogin.d2l']")))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='loginForm:username']")))
				.sendKeys("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='loginForm:password']")))
				.sendKeys("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='loginForm:loginButton']")))
				.click();

	}

	public static WebElement expand_shadow_element(WebElement element) {
		WebElement shadow_root = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot", element);
		return shadow_root;
	}

	@Test(priority = 2)
	public void getBusinessAnalysis() throws InterruptedException {
		Thread.sleep(3000);
		WebElement root1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/d2l-my-courses[1]"));
		WebElement shadow_root1 = expand_shadow_element(root1);

		WebElement root2 = shadow_root1.findElement(By.cssSelector("d2l-my-courses-legacy"));
		WebElement shadow_root2 = expand_shadow_element(root2);

		WebElement root3 = shadow_root2.findElement(By.cssSelector("d2l-my-courses-content-animated"));
		WebElement shadow_root3 = expand_shadow_element(root3);

		WebElement root4 = shadow_root3.findElement(By.cssSelector("div.my-courses-content > d2l-course-tile-grid"));
		WebElement shadow_root4 = expand_shadow_element(root4);

		WebElement business = shadow_root4.findElement(By.cssSelector(
				"#https\\:\\/\\/70542791-11e3-4a0b-b529-fae95d826299\\.enrollments\\.api\\.brightspace\\.com\\/enrolled-user\\/ADHqz7_yn6-aJq7DdM2FIv6eezsYoLxRdBDeMzgIBf8\\/enrollment"));
		String js = "arguments[0].setAttribute('value','pdf')";
		((JavascriptExecutor) driver).executeScript(js, business);

		actions.moveToElement(business).click().perform();

	}

	@Test(priority = 3)
	public void clickGrades() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"body > header > nav > d2l-navigation > d2l-navigation-main-footer > div > div > div:nth-child(5) > a")))
				.click();

	}

	@Test(priority = 4)
	public void getGrades() throws Exception {
    List<WebElement> rowNum = driver.findElement(By.xpath("//table[@id='z_a']/tbody/tr[3]/td"));
	System.out.println("Total numbers of rows are" + rowNum);
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();

	}

}