package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    WebElement search = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    Select s = new Select(search); // it is a parameter class constructor
   // s.selectByVisibleText("Prime Video");
  //  s.selectByValue("search-alias=mi");
    s.selectByIndex(5);
	}

}
