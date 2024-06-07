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
import org.openqa.selenium.support.ui.Select;

public class GrotechmindRegistrationForm {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
    FileInputStream f1= new FileInputStream("C:\\Users\\B N D MOUNIKA\\eclipse-workspace\\Selenium\\TestData\\test3.xlsx");
	Workbook wb = WorkbookFactory.create(f1);
	String name =wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	System.out.println(name);
	String Lname =wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
	System.out.println(Lname);
	String email = wb.getSheet("login").getRow(3).getCell(1).getStringCellValue();
    System.out.println(email);
    String mobileno =NumberToTextConverter.toText(wb.getSheet("login").getRow(4).getCell(1).getNumericCellValue());
    System.out.println(mobileno);
    String adharno =NumberToTextConverter.toText(wb.getSheet("login").getRow(5).getCell(1).getNumericCellValue());
    System.out.println(adharno);
    String Panno = wb.getSheet("login").getRow(6).getCell(1).getStringCellValue();
    System.out.println(Panno);
    
    
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://grotechminds.com/registeration-form/");
   WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
   fname.sendKeys(name);
   WebElement laname = driver.findElement(By.xpath("//input[@id='lastName']"));
   laname.sendKeys(Lname);
   WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
   email1.sendKeys(email);
   WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
   phone.sendKeys(mobileno);
   WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
  
   Select s = new Select(gender);
   s.selectByVisibleText("Female");
   WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
   Select s1 = new Select(state);
   s1.selectByVisibleText("Andhra Pradesh");
   WebElement adhar = driver.findElement(By.xpath("//input[@id='aadhaar']"));
   adhar.sendKeys(adharno);
   
   WebElement pan = driver.findElement(By.xpath("//input[@id='pan']"));
   pan.sendKeys(Panno);
   
   WebElement term = driver.findElement(By.xpath("//input[@id='terms']"));
  if(term.isSelected()==false)
  {
	  System.out.println("it is not selected");
	  term.click();
  }
  else
  {
	  System.out.println("it is alredy selected");
  }
  WebElement register = driver.findElement(By.xpath("//button[@name='Submit']"));
  register.click();
  Thread.sleep(2000);
	driver.switchTo().alert().accept();
	}

}
