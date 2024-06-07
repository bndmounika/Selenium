package programs_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelprogram2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// we shoud get file not exception since i have given wrong path 
		    FileInputStream f1 = new FileInputStream ("d:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\Test.xlsx");
			Workbook wb =WorkbookFactory.create(f1);
			String username = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		    System.out.println(username);
		    String password = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		    System.out.println(password);
		    
			}

		
	}


