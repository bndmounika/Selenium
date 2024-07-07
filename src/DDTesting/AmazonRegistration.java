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

public class AmazonRegistration {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream f1 = new FileInputStream("C:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\test3.xlsx");
     Workbook wb = WorkbookFactory.create(f1);
     String name = wb.getSheet("login").getRow(5).getCell(0).getStringCellValue();
     System.out.println(name);
     String email = wb.getSheet("login").getRow(6).getCell(0).getStringCellValue();
     System.out.println(email);
     String passw =wb.getSheet("login").getRow(7).getCell(0).getStringCellValue();
     System.out.println(passw);
     String repassw =wb.getSheet("login").getRow(8).getCell(0).getStringCellValue();
     System.out.println(repassw);
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.com/ap/register?openid.return_to=https%3A%2F%2Ftrack.amazon.com%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_shippingrecipientcentral_us&openid.mode=checkid_setup&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	 WebElement name2 = driver.findElement(By.xpath("//input[@name='customerName']"));
	name2.sendKeys(name);
	WebElement email2 =driver.findElement(By.xpath("//input[@name='email']"));
	email2.sendKeys(email);
	WebElement pswd2= driver.findElement(By.xpath("//input[@name='password']"));
	pswd2.sendKeys(passw);
	WebElement pswd3= driver.findElement(By.xpath("//input[@name='passwordCheck']"));
	pswd3.sendKeys(passw);
	

	}

}
