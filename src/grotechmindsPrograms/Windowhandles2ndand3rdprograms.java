package grotechmindsPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles2ndand3rdprograms {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://grotechminds.com/window-handle-and-handles/");
        WebElement b2 =driver.findElement(By.xpath("(//button[.='Launch Broweser 2'])[1]"));
        b2.click();
        Set<String> ids = driver.getWindowHandles();
        System.out.println(ids);
	                 Iterator<String> s= ids.iterator();
	                 String pid =s.next();
	                 String cid =s.next();
	                 System.out.println(pid);
	                 System.out.println(cid);
	
	}

}
