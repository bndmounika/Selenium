package programs_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Goole_title {
public static void main(String[] args) {
 // TODO Auto-generated method stub
 ChromeDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.Google.com");
WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
w1.until(ExpectedConditions.titleIs("Food"));
 WebElement india = driver.findElement(By.name("q"));
 india.sendKeys("India");
 india.sendKeys(Keys.ENTER);
 
 
/* WebElement in =driver.findElement(By.cssSelector("#APjFqb"));
 in.sendKeys("India");*/
 
 }

}
