package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pharmancy {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://pharmeasy.in/#");
	WebElement search = driver.findElement(By.xpath("(//div[@class='c-PJLV c-bXbWpx c-bXbWpx-lfylVv-direction-row c-bXbWpx-fMErMJ-justify-left c-bXbWpx-joJbDg-align-center c-bXbWpx-ielOayq-css'])[2]"));
	Actions a = new Actions(driver);
	a.moveToElement(search).perform();
	search.click();
	WebElement search2 = driver.findElement(By.xpath("//input[@id='topBarInput']"));
	search2.sendKeys("Diclo");
	Thread.sleep(2000);
    List<WebElement> list =	driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iieFQlv-css']/div/a"));
    int count = list.size();
	System.out.println(count);
	list.get(4).click();
	
	}

}
