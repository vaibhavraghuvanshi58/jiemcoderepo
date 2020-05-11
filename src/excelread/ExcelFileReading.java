package excelread;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReading {
	public static void main(String[] args) {
		// xls  - HSSF
		// xlsx - XSSF
		// Workbook -> Sheet -> Row -> Column
		Workbook wb = null;
		try {
			 wb = 
					new HSSFWorkbook(new FileInputStream
							(new File("C:\\Users\\Vaibhav\\git\\jiemcoderepo4\\files\\test1.xlsx")));
			 Sheet sh = wb.getSheet("Test");
			 
			 int rows =  sh.getLastRowNum();
			 Row rw = sh.getRow(0);
			 int totalcolumns = rw.getLastCellNum();
			 
			 for(int i = 0; i <= rows ;i++) {
				 for(int j = 0; j < totalcolumns ; j++) {
					 Cell cl = sh.getRow(i).getCell(j);
					 if(cl.getCellType() == CellType.STRING) {
						 System.out.println(cl.getStringCellValue());
					 }
					 if(cl.getCellType() == CellType.NUMERIC) {
						 System.out.println(cl.getNumericCellValue());
					 }
				 }
			 }
			 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			if(wb != null) {
				try {
				wb.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
