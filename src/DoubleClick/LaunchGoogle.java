package DoubleClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchGoogle {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    WebElement Gmail=   driver.findElement(By.linkText("Gmail"));
    Actions a = new Actions(driver);
    a.doubleClick(Gmail).perform();
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
