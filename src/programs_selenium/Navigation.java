package programs_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.navigate().to("https://www.amazon.in/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
    driver.navigate().forward();
	}

}
