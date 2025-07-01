package com.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
   public static Object[][] getExcelData(String FilePath,String sheetName) throws IOException{
	   FileInputStream fis= new FileInputStream(FilePath);
	   Workbook workbook=new XSSFWorkbook(fis);
	   Sheet sheet=workbook.getSheet(sheetName);
	   
	   int rowCount = sheet.getPhysicalNumberOfRows();
       int colCount = sheet.getRow(0).getLastCellNum();
       Object[][] data = new Object[rowCount - 1][colCount];

       for (int i = 1; i < rowCount; i++) {
           Row row = sheet.getRow(i);
           for (int j = 0; j < colCount; j++) {
               data[i - 1][j] = getCellValueAsString(row.getCell(j));
           }
       }

       workbook.close();
       fis.close();
       return data;
	
	   
   }
   private static String getCellValueAsString(Cell cell) {
       if (cell == null) return "";
       switch (cell.getCellType()) {
           case STRING:
               return cell.getStringCellValue();
           case NUMERIC:
               // Handle both integers and dates
               if (DateUtil.isCellDateFormatted(cell)) {
                   return cell.getDateCellValue().toString();
               } else {
                   return String.valueOf((int) cell.getNumericCellValue());
               }
           case BOOLEAN:
               return String.valueOf(cell.getBooleanCellValue());
           case FORMULA:
               return cell.getCellFormula();
           case BLANK:
               return "";
           default:
               return "";
       }}
}
