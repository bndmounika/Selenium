package grotechmindsPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles1stand2ndprograms {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://grotechminds.com/window-handle-and-handles/");
    WebElement b1 =driver.findElement(By.xpath("(//button[.='Launch Broweser 1'])[1]"));
	b1.click();
	Set<String> ids =driver.getWindowHandles();
	System.out.println(ids);
	Iterator<String> s1 =ids.iterator();
	String parent = s1.next();
	String child =s1.next();
	System.out.println(parent);
	System.out.println(child);
	//driver.manage().window().maximize();
	}

}
