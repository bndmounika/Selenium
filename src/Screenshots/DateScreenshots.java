package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateScreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		 ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com/");
	     driver.manage().window().maximize();
	     WebElement loc=  driver.findElement(By.xpath("//textarea[@name='q']"));
	 	 loc.sendKeys("Banglore");
	 	 loc.sendKeys(Keys.ENTER);
	 	 Thread.sleep(2000);
	 	 TakesScreenshot sc = driver;
	 	 File source =sc.getScreenshotAs(OutputType.FILE);
	 	 Date d1 = new Date();
	 	 String date = d1.toString();
	 	 System.out.println(date);
	 	 String colon = date.replace(":", "_");
	 	 System.out.println(colon);
	 	 String month =date.substring(4, 8);
	 	 System.out.println(month);
	 	 String day =date.substring(0, 3);
	 	System.out.println(day);
	 	 String Time =colon.substring(11, 19);
	 	System.out.println(Time);
	 	 String date1 =date.substring(8, 10);	 
	 	System.out.println(date1);
	 	 String year =date.substring(24);
	 	 System.out.println(year);
	 	 
	   // File Destination1 = new File("C:\\Users\\B N D MOUNIKA\\Desktop\\Mouni\\siri".concat(" ").concat(month).concat(" ").concat(date1).concat(" ").concat(Time).concat(" ")+".png");
	 	File Destination = new File("C:\\Users\\B N D MOUNIKA\\Desktop\\Mouni\\siri".getClass()+".png");
	     FileHandler.copy(source, Destination);
	}

}
