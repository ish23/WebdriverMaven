package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void doLogin() throws InterruptedException {
		driver.get("https://idp.gsu.edu/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html//input[@id='loginForm:username']")).sendKeys("wow@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html//input[@id='loginForm:password']")).sendKeys("blah");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html//input[@id='loginForm:loginButton']")).click();
	}
	
	@AfterSuite
    public void tearDown() {
	driver.quit();
	
	}

}