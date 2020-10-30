package com.IshMum.businessAnalysis;

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

public class ExtractBusinessGrade extends TestBase {

	@Test(priority = 4)
	public void getGrades() throws Exception {

		XSSFSheet sh = wb.createSheet("BusinessAnalysis");

		fos = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\fall2020grades.xlsx");

		for (int rows = 1; rows <= 1; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 4; cols++) {
				font.setBold(true);
				style.setFont(font);
				Cell cell1 = row.createCell(cols - 1);
				cell1.setCellStyle(style);
				cell1.setCellValue(
						driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[1]/th[" + cols + "]")).getText());

			}

		}

		for (int rows = 2; rows <= 2; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				font.setBold(true);
				style.setFont(font);
				Cell cell = row.createCell(cols - 1);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());

			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}

		for (int rows = 3; rows <= 11; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}

		for (int rows = 12; rows <= 12; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				font.setBold(true);
				style.setFont(font);
				Cell cell = row.createCell(cols - 1);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 13; rows <= 23; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 24; rows <= 24; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				font.setBold(true);
				style.setFont(font);
				Cell cell = row.createCell(cols - 1);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 25; rows <= 27; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 28; rows <= 28; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				font.setBold(true);
				style.setFont(font);
				Cell cell = row.createCell(cols - 1);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 29; rows <= 37; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 38; rows <= 38; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 39; rows <= 47; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 48; rows <= 48; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 49; rows <= 57; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 58; rows <= 58; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 59; rows <= 68; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}

		for (int rows = 69; rows <= 69; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 70; rows <= 74; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 75; rows <= 75; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 76; rows <= 77; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 78; rows <= 78; rows++) {
			Row row = sh.createRow(rows - 1);
			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				font.setBold(true);
				style.setFont(font);
				cell.setCellStyle(style);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 1; cols <= 3; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
			}
		}
		for (int rows = 79; rows <= 79; rows++) {
			Row row = sh.createRow(rows - 1);

			for (int cols = 1; cols <= 1; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/th")).getText());
			}

			for (int cols = 2; cols <= 4; cols++) {
				Cell cell = row.createCell(cols - 1);
				cell.setCellValue(driver
						.findElement(By.xpath("//*[@id=\"z_a\"]/tbody/tr[" + rows + "]/td[" + cols + "]")).getText());
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
