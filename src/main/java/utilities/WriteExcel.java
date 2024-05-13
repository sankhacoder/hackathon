package utilities;

import java.io.File;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void excelData() throws Exception {

		XSSFWorkbook wb = new XSSFWorkbook();

		XSSFSheet sheet = wb.createSheet();

		sheet.createRow(0);

		sheet.getRow(0).createCell(0).setCellValue("Debojyoti");
		sheet.getRow(0).createCell(1).setCellValue("abc@gmail.com");
		sheet.getRow(0).createCell(2).setCellValue("9339376");
		sheet.getRow(0).createCell(3).setCellValue(" ");
		sheet.getRow(0).createCell(4).setCellValue(" ");
		sheet.getRow(0).createCell(5).setCellValue(" ");


		sheet.createRow(1);

		sheet.getRow(1).createCell(0).setCellValue("Sankha");
		sheet.getRow(1).createCell(1).setCellValue("xyz@gmail.com");
		sheet.getRow(1).createCell(2).setCellValue("8481818495");
		sheet.getRow(1).createCell(3).setCellValue("Navallur");
		sheet.getRow(1).createCell(4).setCellValue("600013");
		sheet.getRow(1).createCell(5).setCellValue("Congratulations!!");

		File file = new File("ExcelData/testInput.xlsx");

		FileOutputStream fOS = new FileOutputStream(file);

		wb.write(fOS);

		wb.close();

	}

}
