package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_links {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    List<WebElement> link =driver.findElements(By.tagName("a"));
	    int count = link.size();
	    System.out.println(count);
	    
	    for(int i=0;i<count;i++)
	    {
	   WebElement s =link.get(i);
	   String textoflinks =  s.getAttribute("href");
	   System.out.println(textoflinks);
	  String  linktextvalue = s.getText();
	  System.out.println(linktextvalue);
	}

}
}