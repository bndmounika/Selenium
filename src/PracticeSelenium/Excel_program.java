package PracticeSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\practice.xlsx");
	    Workbook wb=   WorkbookFactory.create(f1);
	    Sheet s1 =wb.getSheet("login");
	       Row r     =s1.getRow(1);
	       Cell c =r.getCell(0);
	      String value=  c.getStringCellValue();
	      System.out.println(value);
	
	}
	
	
}
