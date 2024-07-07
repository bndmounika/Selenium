package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://grotechminds.com/dropdown/");
    driver.manage().window().maximize();
    WebElement select =driver.findElement(By.xpath("(//select[@name='Choice1'])[1]"));
    Select s = new Select(select);
    s.selectByVisibleText("Demo2");
    WebElement find = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	find.click();
	}

}
