package DDTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

 FileInputStream  f = new FileInputStream("C:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\test3.xlsx");	
 Workbook wb =WorkbookFactory.create(f);
 String email = wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
 System.out.println(email);
 String passw =wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
 System.out.println(passw);
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	WebElement email2 =driver.findElement(By.xpath("//input[@name='email']"));
	email2.sendKeys(email);
	WebElement Continue =driver.findElement(By.xpath("//input[@id='continue']"));
	Continue.click();
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(passw);
	WebElement signin =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	signin.click();
	}

}
