package lib;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFeeder {
	
static Sheet excelSheet;
public static Object[][] excelToObject(String filePath, String sheetname) throws IOException{
	Object [][] tabArray;
	
	FileInputStream excelFileRead = new FileInputStream(filePath);
	Workbook excelWBook = new XSSFWorkbook(excelFileRead);
	excelSheet = excelWBook.getSheet(sheetname);
	
	int totalRows = excelSheet.getPhysicalNumberOfRows();
	int totalCols = excelSheet.getRow(0).getPhysicalNumberOfCells();
	
	tabArray = new Object[totalRows-1][totalCols];
	
	for (int row = 1; row < totalRows; row++) {
		for (int col = 0; col < totalCols; col++) {
			
			tabArray[row-1][col] = getCellData(row, col);
				
			
		}
		
	}
	
	return tabArray;
	
}

public static String getCellData(int row , int col) {
	Cell cell = excelSheet.getRow(row).getCell(col);
	String cellData = "";
	
	if (cell.getCellType()==CellType.NUMERIC) {
		if (cell.getNumericCellValue()%1==0) {//int Value
			cellData = "" + (int) cell.getNumericCellValue();
								
	} else {//double
		cellData = "" + cell.getNumericCellValue();
		}
		

	}
	else if(cell.getCellType()== CellType.STRING) {
		cellData = cell.getStringCellValue().trim();
	}
	return cellData;
	
	
}

}
