package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://grotechminds.com/javascript-popup/");
	WebElement click =driver.findElement(By.xpath("//button[.='Click ']"));
	click.click();
	driver.switchTo().alert().accept();
	
	}

}
