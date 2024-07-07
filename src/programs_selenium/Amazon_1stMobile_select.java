package programs_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class Amazon_1stMobile_select {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("bmounika618@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("Password@123");
	WebElement Signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	Signin.click();
	WebElement BuyAgain =driver.findElement(By.xpath("//a[contains(text(),'Buy Again')]"));
	BuyAgain.click();
	WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("mobile");
	WebElement submit =driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
	WebElement firstMobile =driver.findElement(By.xpath("//div[@class=\"a-section aok-relative s-image-fixed-height\"][1]"));
	firstMobile.click();
	
	Set<String> s1= driver.getWindowHandles();
    System.out.println(s1);
    System.out.println(s1.size());
   
    //driver.close();
   Iterator<String> itr= s1.iterator();
   String parentid =itr.next();
   String childid = itr.next();
   System.out.println(parentid);
   System.out.println(childid);
   driver.switchTo().window(childid);
   WebElement cart = driver.findElement(By.xpath("//input[@id ='add-to-cart-button']"));
   cart.click();
	}

}
