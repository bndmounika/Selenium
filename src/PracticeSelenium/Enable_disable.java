package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_disable {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://google.com/");
    driver.manage().window().maximize();
    WebElement search =driver.findElement(By.xpath("//textarea[@name='q']"));
	if(search.isDisplayed() && search.isEnabled())
	{
		search.sendKeys("hyderabad");
		search.sendKeys(Keys.ENTER);
		System.out.println("send the keys in search box");
	}
	else
	{
		System.out.println("Search box has not displayed and enabled");
	}
	
	}

}
