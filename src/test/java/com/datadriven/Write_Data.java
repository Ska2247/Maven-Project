package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void write_Data() throws IOException {

		File f = new File("F:\\Data Driven Write\\Book2.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("karthi").createRow(0).createCell(0).setCellValue("Name");

		wb.getSheet("karthi").getRow(0).createCell(1).setCellValue("Roll No");

		wb.getSheet("karthi").createRow(1).createCell(0).setCellValue("Hemanth");

		wb.getSheet("karthi").getRow(1).createCell(1).setCellValue("21345");

		wb.getSheet("karthi").createRow(2).createCell(0).setCellValue("Mano");

		wb.getSheet("karthi").getRow(2).createCell(1).setCellValue("89765");

		wb.getSheet("karthi").createRow(3).createCell(0).setCellValue("Fino");

		wb.getSheet("karthi").getRow(3).createCell(1).setCellValue("56432");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);
		wb.close();
	}

	public static void main(String[] args) throws IOException {

		write_Data();
	}

}
