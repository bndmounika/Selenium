package programs_selenium;
import java.util.List;

// Ass133- Goto Amazon.in locate shoe with relative xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_shoes {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("shoes");
	Thread.sleep(2000);
	//WebElement find =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//	find.click();
	List<WebElement> auto =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));	
	int count = auto.size();
	System.out.println(count);
	auto.get(4).click();
	
	}

}
