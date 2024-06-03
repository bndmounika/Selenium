package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByVisibleText("22");
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		Select s1= new Select(month);
		s1.selectByValue("8");
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		Select s2= new Select(year);
		s2.selectByVisibleText("2000");
		
}

}
