package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_Displayed {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    WebElement search=   driver.findElement(By.xpath("//textarea[@name='q']"));
	if(search.isDisplayed()&& search.isEnabled())
	{
		search.sendKeys("India");
	}
	
	}

}
