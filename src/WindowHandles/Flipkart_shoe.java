package WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_shoe {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
	WebElement sendkeys = driver.findElement(By.xpath("//input[@name='q']"));
	sendkeys.sendKeys("Mobile");
	WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
	search.click();
	WebElement fs = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]"));
	fs.click();
	//Thread.sleep(2000);
	WebElement ss = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]"));
	ss.click();
	//Thread.sleep(2000);
	WebElement ts = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]"));
	ts.click();
	//Thread.sleep(2000);
	WebElement fts = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[4]"));
	fts.click();
	//Thread.sleep(2000);
	Set<String> ids = driver.getWindowHandles();
	System.out.println(ids);
	Iterator<String> s =ids.iterator();
	String parentid =s.next();
	String child1id =s.next();
	String child2id =s.next();
	String child3id =s.next();
	String child4id =s.next();
	System.out.println(parentid);
	System.out.println(child1id);
	System.out.println(child2id);
	System.out.println(child3id);
	System.out.println(child4id);
	Thread.sleep(2000);
	//driver.close();
	driver.switchTo().window(child2id);
	//Thread.sleep(3000);
	WebElement buybutton =driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
	buybutton.click();
	
	}
	

}
