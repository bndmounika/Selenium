package programs_selenium;
//ass -138 Program to hover over on flipcart ->fashion->Mens T shirt
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Hoverover {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Actions a = new Actions(driver);
	WebElement Fashion = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
	a.moveToElement(Fashion).perform();
	WebElement tshirt = driver.findElement(By.linkText("Men's T-Shirts"));
	tshirt.click();
	}

}
