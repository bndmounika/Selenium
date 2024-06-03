package HoveroverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotechminds_1 {

	public static void main(String[] args) {
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://grotechminds.com/hoverover/");
   Actions a = new Actions(driver);
   WebElement h= driver.findElement(By.xpath("//div[@data-id='1857001']"));
   a.moveToElement(h).perform();
   WebElement P3= driver.findElement(By.xpath("//div[contains(text(),'Practice3')]"));
   P3.click();
	}

}
