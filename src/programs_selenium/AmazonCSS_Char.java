package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCSS_Char {

	public static void main(String[] args) {
	
		    ChromeDriver driver  = new ChromeDriver();
		    driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		    WebElement chara= driver.findElement(By.cssSelector("input[id^='twotabse']"));
            chara.sendKeys("Gold");
	}

}
