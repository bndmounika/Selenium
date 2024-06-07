package WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search =	driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
		search.sendKeys("Shoes");
		WebElement search2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search2.click();
		WebElement firstshoe = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]"));
	    firstshoe.click();
	    Set<String> ids =  driver.getWindowHandles();
	    System.out.println(ids);
	    Iterator<String> sepid = ids.iterator();
	    String Parentid =sepid.next();
	    String Childid = sepid.next();
	    System.out.println(Parentid);
	    System.out.println(Childid);
	    driver.switchTo().window(Childid);
	    WebElement wishlist =driver.findElement(By.xpath("//span[@id='wishListMainButton']"));
	    wishlist.click();
	    WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
	    email.sendKeys("bmounika618@gmail.com");
	    WebElement continuebutton =driver.findElement(By.xpath("//input[@id='continue']"));
	    continuebutton.click();
	    WebElement password = driver.findElement(By.xpath("//input[@id ='ap_password']"));
	    password.sendKeys("Password@123");
	    WebElement signin =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	    signin.click();
	    WebElement addtocart =driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
	    addtocart.click();
	    WebElement buy =driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	    buy.click();
	}

}
