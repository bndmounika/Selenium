package DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pro1 {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://grotechminds.com/drag-and-drop/");
	WebElement drag = driver.findElement(By.xpath("(//div[@id='container'])[7]"));
	WebElement drop = driver.findElement(By.xpath("(//div[@id='div2'])"));
	Actions a = new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
	Thread.sleep(2000);
	a.dragAndDrop(drop, drag).perform();
	
	}

}
