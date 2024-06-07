package programs_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excelprogram4 {
// expecting java.lang.IllegalStateException: 
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		 FileInputStream f1 = new FileInputStream ("c:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\test3.xlsx");
			Workbook wb =WorkbookFactory.create(f1);
			//String username = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	    	String mobileno =	NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		    System.out.println(mobileno);
		  
			}
}