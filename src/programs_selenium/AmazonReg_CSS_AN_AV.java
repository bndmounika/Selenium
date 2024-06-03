package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonReg_CSS_AN_AV {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/ap/register?openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  WebElement name=driver.findElement(By.cssSelector("[name='customerName']"));
	   name.sendKeys("Mounika");
	   WebElement mobilenum =driver.findElement(By.cssSelector("input[id='ap_phone_number']"));
	   mobilenum.sendKeys("999999999");
	}

}
