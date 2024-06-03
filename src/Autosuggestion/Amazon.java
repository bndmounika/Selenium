package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> auto =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));	
		int count = auto.size();
		System.out.println(count);
		auto.get(4).click();
	}

}
