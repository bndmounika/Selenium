package programs_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelprogram1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream f1 = new FileInputStream ("C:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\Test.xlsx");
	Workbook wb =WorkbookFactory.create(f1);
	/*Sheet s1 = wb.getSheet("login");
	Row r1= s1.getRow(1);
	Cell c1 = r1.getCell(0);
	String value1 =c1.getStringCellValue();
	System.out.println(value1);*/
	String username = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
    System.out.println(username);
    String password = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
    System.out.println(password);
    String username1 = wb.getSheet("login").getRow(2).getCell(0).getStringCellValue();
    System.out.println(username1);
    String password1 = wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
    System.out.println(password1);
	}

}
