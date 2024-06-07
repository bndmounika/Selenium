package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_shoe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    WebElement search =	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    search.sendKeys("shoe");
	    Thread.sleep(2000);
	    List<WebElement>list =driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
	    int count =list.size();
	    System.out.println(count);
	    list.get(0).click();
	}

}
