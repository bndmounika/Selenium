package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Login {

	public static void main(String[] args) {
     ChromeDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
     WebElement Continue = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
     Continue.click();
     WebElement Un = driver.findElement(By.id("username"));
     Un.sendKeys("Mounika");
     WebElement Pass = driver.findElement(By.name("password"));
     Pass.sendKeys("Mounika");
     WebElement Cap = driver.findElement(By.name("loginCaptchaValue"));
     Cap.sendKeys("abc@321");
     
     
	}

}
