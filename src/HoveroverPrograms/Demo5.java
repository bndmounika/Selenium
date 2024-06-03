package HoveroverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://grotechminds.com/hoverover/");
    Actions a = new Actions(driver);
    WebElement Demo5 =  driver.findElement(By.xpath("//div[@data-id='551f3a8']"));
    a.moveToElement(Demo5).perform();
    WebElement P1 = driver.findElement(By.xpath("//div[@class='popup7'][1]"));
    P1.click();
	}

}
