package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*Ass -127 Launch facebook.com > click on create account > 
 * register yourself > Use name and ID locator*/
public class Facebook_login {

	public static void main(String[] args) {
	//	EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Mounika");
		driver.findElement(By.id("pass")).sendKeys("Mounika");
	//	driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("login")).click();
	}

}
