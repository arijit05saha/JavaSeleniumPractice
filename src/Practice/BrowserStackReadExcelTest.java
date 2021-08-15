package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrowserStackReadExcelTest {
	
	public void readExcel(String file, int sheetNo, int rowNo, int colNo) throws IOException {
		
		FileInputStream fs = new FileInputStream(file);
		
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(sheetNo);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(colNo);
		System.out.println(sheet.getRow(0).getCell(0));
	}
	
//	public void writeExcel() {
//		FileInputStream fs1 = new FileInputStream("C:\\Arijit\\Selenium\\WriteData.xlsx");
//		Workbook wb = new XSSFWorkbook(fs1);
//		Sheet sheet1 = wb.getSheetAt(0);
//		int lastRow = sheet1.getLastRowNum();
//		for(int i=0; i<=lastRow; i++){
//		Row row = sheet1.getRow(i);
//		Cell cell = row.createCell(2);
//
//		cell.setCellValue("WriteintoExcel");
//
//		}
//
//		FileOutputStream fos = new FileOutputStream(path);
//		wb.write(fos);
//		fos.close();
//	}
	
	public static void main (String [] args) throws IOException{
		//Path of the excel file
		String fileName = "C:\\Arijit\\Selenium\\TestData.xlsx";
		
		
		
		BrowserStackReadExcelTest bs = new BrowserStackReadExcelTest();
		bs.readExcel(fileName, 0, 2, 2);
		
//		bs.writeExcel();
		
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
	}
}
