package PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot_Practice1 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.Google.com");
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleIs("Google"));
		 WebElement india = driver.findElement(By.name("q"));
		 india.sendKeys("India");
		 india.sendKeys(Keys.ENTER);
		 TakesScreenshot a= driver;
		 File source = a.getScreenshotAs(OutputType.FILE);
		 File Destination = new File("C:\\Users\\B N D MOUNIKA\\Desktop\\Mouni\\Practice"+Math.random()+".png");
		 FileHandler.copy(source, Destination);
		 
	}

}
