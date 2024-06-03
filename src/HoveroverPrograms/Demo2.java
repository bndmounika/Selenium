package HoveroverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Write A Program To Hoverover Demo 2 And Click On Practice 6*/
public class Demo2 {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://grotechminds.com/hoverover/");
    Actions a = new Actions(driver);
    WebElement Demo2 = driver.findElement(By.xpath("//div[@data-id='ab4cf56']"));
    a.moveToElement(Demo2).perform();
    WebElement p6 = driver.findElement(By.xpath("(//div[contains(text(),'Practice6')])[2]"));
    p6.click();
 /*   WebElement p8 = driver.findElement(By.xpath("(//div[contains(text(),'Practice6')])[4]"));
    p8.click();
    WebElement p9 = driver.findElement(By.xpath("(//div[contains(text(),'Practice6')])[8]"));
    p9.click();*/
    
	}

}
