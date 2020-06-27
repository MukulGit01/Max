package com.isomorphic.testrunner;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("M:\\Mukul Automation\\Selenium with Eclips and JDK\\Eclipse\\Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook Data = new XSSFWorkbook(fis);
		
		XSSFSheet Sheet1 = Data.getSheetAt(0);
		
		String DataRow = Sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Value of Row is" + (DataRow));
	}

}
