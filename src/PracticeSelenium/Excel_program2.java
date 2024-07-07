package PracticeSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excel_program2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("C:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\practice.xlsx");
	    Workbook wb=   WorkbookFactory.create(f1);
         String username =wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
         System.out.println(username);
         String password =wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
         System.out.println(password);
     	String mobileno = NumberToTextConverter.toText(wb.getSheet("login").getRow(3).getCell(1).getNumericCellValue());
    	System.out.println(mobileno);
	}

}
