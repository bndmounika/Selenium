package PracticeSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SBILogin {

	public static void main(String[] args) {
   ChromeDriver driver = new ChromeDriver();
   driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
   driver.manage().window().maximize();
   
	}

}
