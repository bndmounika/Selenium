package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/*Ass-126 Demonstate a program for facebook.com launch > 
 * enter email and pass with help of id locator*/
public class Facebook_1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Mounika");
		driver.findElement(By.name("pass")).sendKeys("Password@123");
	//	driver.findElement(By.id("u_0_0_5U")).click();
		}

}
