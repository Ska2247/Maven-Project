package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.graph.ElementOrder.Type;

public class Read_Data {

	// PARTICULAR CELL DATA
	public static void Particular_Cell_Data() throws IOException {

		File f = new File("F:\\Maven\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(1);

		Cell c = r.getCell(0);

		CellType Type = c.getCellType();

		if (Type.equals(CellType.STRING)) {

			String value = c.getStringCellValue();
			System.out.println(value);

		} else if (Type.equals(CellType.NUMERIC)) {

			double d = c.getNumericCellValue();

			// double to int
			int a = (int) d;

			// int to string
			String value = String.valueOf(a);
			System.out.println(value);

		}
		wb.close();

	}

//PARTICULAR ROW DATA
	public static void particular_Row_Data() throws IOException {

		File f = new File("F:\\Maven\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(1);

		int numberOfCells = r.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {

			Cell c = r.getCell(i);
			CellType Type = c.getCellType();
			if (Type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);
			} else if (Type.equals(CellType.NUMERIC)) {

				double d = c.getNumericCellValue();
				// double to int
				int a = (int) d;

				// int to string
				String value = String.valueOf(a);
				System.out.println(value);
			}
		}
		wb.close();
	}

//PARTICULAR COLUMN DATA
	public static void particular_Column_Data() throws IOException {

		File f = new File("F:\\Maven\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		// Row r = s.getRow(1);

		// Cell c = r.getCell(1);

		int numberOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {

			Row r = s.getRow(i);
			Cell c = r.getCell(1);
			CellType Type = c.getCellType();
			if (Type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);
			} else if (Type.equals(CellType.NUMERIC)) {

				double d = c.getNumericCellValue();
				// double to int
				int a = (int) d;

				// int to string
				String value = String.valueOf(a);
				System.out.println(value);
			}
		}
		wb.close();

	}

	public static void all_Data() throws IOException {

		File f = new File("F:\\Maven\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int numberOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {

			Row r = s.getRow(i);

			int numberOfCells = r.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell c = r.getCell(j);

				CellType Type = c.getCellType();
				if (Type.equals(CellType.STRING)) {

					String value = c.getStringCellValue();
					System.out.println(value);
				} else if (Type.equals(CellType.NUMERIC)) {

					double d = c.getNumericCellValue();

					// double to int
					int a = (int) d;
					// int to string
					String value = String.valueOf(a);
					System.out.println(value);

				}
			}

		}
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		// Particular_Cell_Data();
		// particular_Column_Data();
		// particular_Row_Data();
		all_Data();
	}

}
