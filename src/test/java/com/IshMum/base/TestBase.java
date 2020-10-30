package com.IshMum.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static Properties config;
	public static Properties obref;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static Actions actions;
	public static WebDriverWait wait;
	public static XSSFSheet sh;
	public static FileOutputStream fos;
	public static Row row;
	public static Cell cell;
	public static XSSFWorkbook wb;
	public static CellStyle style;
	public static XSSFFont font;
	
	@BeforeSuite
	public void setUp() throws IOException {
		config = new Properties();
		obref = new Properties();
	
		
		if (driver == null) {

			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fis);
		
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\ObjectRef.properties");
			obref.load(fis);

			if (config.getProperty("browser").equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (config.getProperty("browser").equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (config.getProperty("browser").equals("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

		}
		wait = new WebDriverWait(driver, 5);
		actions = new Actions(driver);
		wb = new XSSFWorkbook();
		font = wb.createFont();
		style = wb.createCellStyle();
	
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}

	}
}
