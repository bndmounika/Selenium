package programs_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelprogram3 {
// null pointer exception since it is empty cell
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		 FileInputStream f1 = new FileInputStream ("c:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\Test.xlsx");
			Workbook wb =WorkbookFactory.create(f1);
			String emptycell = wb.getSheet("login").getRow(3).getCell(0).getStringCellValue();
		    System.out.println(emptycell);
		    
		    
			}

		
	}


