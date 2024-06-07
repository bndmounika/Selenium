package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.manage().window().maximize();
     WebElement loc=  driver.findElement(By.xpath("//textarea[@name='q']"));
	loc.sendKeys("India");
	loc.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	TakesScreenshot a1= driver;
	File source =a1.getScreenshotAs(OutputType.FILE);
	//File destination = new File("C:\\Users\\B N D MOUNIKA\\Desktop\\Mouni\\Mani"+Math.random()+".png");
	File Destination = new File("d:\\Users\\B N D MOUNIKA\\Desktop\\Mouni\\siri".getClass()+".png");
	FileHandler.copy(source, Destination);
	
	}

}
