package DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
	    driver.manage().window().maximize();
	    WebElement Jsondrag = driver.findElement(By.xpath("(//div[@id='container'])[11]"));
	    WebElement drop = driver.findElement(By.xpath("//div[@id='div2']"));
	    Actions a = new Actions(driver);
	    a.dragAndDrop(Jsondrag, drop).perform();
	}

}
