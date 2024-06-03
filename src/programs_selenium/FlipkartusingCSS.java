package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartusingCSS {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	//	WebElement search =driver.findElement(By.cssSelector(".Pke_EE"));//using .classname
		//search.sendKeys("Mobiles");
		WebElement search2 =driver.findElement(By.cssSelector("input.Pke_EE[name='q']"));//using TN,Classvalue[AN='AV']
		search2.sendKeys("Mobiles");
		
	}

}
