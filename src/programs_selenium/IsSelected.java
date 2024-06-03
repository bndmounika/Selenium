package programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/B%20N%20D%20MOUNIKA/Documents/learningHTML1.html");
	    WebElement boycheckbox = driver.findElement(By.xpath("//input[@id='123']"));
	   if((boycheckbox.isSelected()==false))  
			   {
		        System.out.println("Checkbox not selected");
		        boycheckbox.click();
		        System.out.println("Checkbox is selected");
			   }
	   else
	   {
		   System.out.println("Checkbox is already selected");
	   }
	
	}

}
