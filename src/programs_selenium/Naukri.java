package programs_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
	 ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQjw0_WyBhDMARIsAL1Vz8uzqF2vnYr71yvzwsKVTLhnJF21P6ubQJxXjP236AnDK30ls_xZBwgaAtyMEALw_wcB&gclsrc=aw.ds");
     WebElement google =driver.findElement(By.xpath("//button[@name='google-register']"));
     google.click();
    Set<String> ids = driver.getWindowHandles();
	Iterator<String> spids = ids.iterator();
    String parentid= spids.next();
    String childid = spids.next();
   driver.switchTo().window(childid);
   WebElement mail = driver.findElement(By.xpath("//input[@id='identifierId']"));
    mail.sendKeys("bmounika618@gmail.com");
   
    
	}

}
