package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown4 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://grotechminds.com/dropdown/");
	    driver.manage().window().maximize();
	    WebElement Choice8 = driver.findElement(By.xpath("(//select[@name='Choice8'])[1]"));
	    Select s = new Select(Choice8);
	    s.selectByVisibleText("QTP8");
	    WebElement  Choice4= driver.findElement(By.xpath("(//select[@name='Choice4'])[1]"));
	    Select s1 = new Select(Choice4);
	    s1.selectByVisibleText("Energy15");
	}

}
