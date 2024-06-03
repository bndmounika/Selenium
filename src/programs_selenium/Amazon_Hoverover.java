package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon_Hoverover {

	public static void main(String[] args) {
    ChromeDriver driver  = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    WebElement accountandlist =  driver.findElement(By.xpath(("//span[@class='nav-line-2 ']")));
    Actions a = new Actions(driver);
    a.moveToElement(accountandlist).perform();
    
    WebElement signin =  driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
    signin.click();
    WebElement email = driver.findElement(By.name("email"));
    email.sendKeys("stbymkt@gmail.com");
    WebElement continuebutton = driver.findElement(By.id("continue"));
    continuebutton.click();
    WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
    password.sendKeys("password@123");
    WebElement signin2 =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
    signin2.click();
    
	
	}

}
