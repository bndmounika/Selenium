package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownUsing_keysfunctions {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    dropdown.sendKeys(Keys.ARROW_DOWN);
    dropdown.sendKeys(Keys.ARROW_DOWN);
    dropdown.sendKeys(Keys.ARROW_DOWN);
    dropdown.sendKeys(Keys.ARROW_DOWN);
	}

}
