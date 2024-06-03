package HoveroverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds2 {
//getting error - org.openqa.selenium.ElementNotInteractableException
  public static void main(String[] args) {
  ChromeDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://grotechminds.com/hoverover/");
  Actions a = new Actions(driver);
  WebElement demo4 = driver.findElement(By.xpath("//div[@data-id='824f369']"));
  a.moveToElement(demo4).perform();
  WebElement Password10 =driver.findElement(By.xpath("(//div[contains(text(), 'Practice10') ])[4]"));
  Password10.click();
 // d10.click();
  //Select s1 = new Select(d10);
  //s1.selectByIndex(9);
//  s1.selectByValue("Practice10");

	}

}
