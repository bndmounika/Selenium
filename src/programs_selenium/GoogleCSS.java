package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCSS {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.Google.com");
		// WebElement in =driver.findElement(By.cssSelector("textarea#APjFqb"));// with help of tagname#id
		 WebElement in =driver.findElement(By.cssSelector("textarea.gLFyf"));
		 in.sendKeys("India");
	}

}
