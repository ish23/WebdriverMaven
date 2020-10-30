package com.IshMum.marketingManagement;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.IshMum.base.TestBase;

public class ExtractMarketingGrade extends TestBase {

	@Test(priority = 7)
	public void getGrades() throws Exception {

		XSSFSheet sh = wb.createSheet("Marketing Management");

		fos = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\fall2020grades.xlsx");

		for (int rows = 1; rows <= 1; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(
						driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[1]/th[" + cols + "]")).getText());

			}

		}

		for (int rows = 2; rows <= 5; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(
						driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + (cols - 1) + "]"))
								.getText());
			}
		}
		for (int rows = 6; rows <= 6; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}

		for (int rows = 7; rows <= 72; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}

		for (int rows = 73; rows <= 73; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}

		for (int rows = 74; rows <= 83; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 84; rows <= 85; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(
						driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + (cols - 1) + "]"))
								.getText());
			}
		}
		for (int rows = 86; rows <= 86; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 87; rows <= 89; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 90; rows <= 90; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 91; rows <= 93; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_l\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		sh.setColumnWidth(0, 14000);
		sh.setColumnWidth(1, 4000);
		sh.setColumnWidth(2, 4000);
		sh.createFreezePane(0, 1);
		wb.write(fos);
		fos.close();
	}
}