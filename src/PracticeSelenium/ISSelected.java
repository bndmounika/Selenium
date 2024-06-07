package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/B%20N%20D%20MOUNIKA/Documents/learningHTML1.html");
	    driver.manage().window().maximize();
	    WebElement boy =driver.findElement(By.xpath("//input[@id='123']"));
	  if(boy.isSelected()==false)
	  {
		  System.out.println("It is not selected");
		  boy.click();
	  }
	  else
	  {
		  System.out.println("It is already selected");
	  }
	
	}
	

}
