package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		    driver.get("https://google.com/");
		    driver.manage().window().maximize();
		    WebElement search =driver.findElement(By.xpath("//textarea[@name='q']"));
		    search.sendKeys("India");
		    Thread.sleep(5000);
			//search.sendKeys(Keys.ENTER);
			
	List<WebElement>	auto =	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count =auto.size();
	System.out.println(count);
	auto.get(5).click();
	}

}
