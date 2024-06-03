package programs_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver1 = new FirefoxDriver();
		//EdgeDriver driver2 = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
	}

}
