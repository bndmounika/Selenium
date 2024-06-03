package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_partiallink {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();	
	    WebElement BestSeller = driver.findElement(By.partialLinkText("Best"));
	    BestSeller.click();
	}

}
