package grotechmindsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/registration/");
	WebElement firstname =driver.findElement(By.xpath("//input[@id ='fname']"));
	firstname.sendKeys("Mounika");
	WebElement lastname =driver.findElement(By.xpath("//input[@id ='lname']"));
	lastname.sendKeys("Bh");
	WebElement email =driver.findElement(By.xpath("//input[@id ='email']"));
	email.sendKeys("bmounika618@gmail");
	WebElement Pswd =driver.findElement(By.xpath("//input[@id ='password']"));
	Pswd.sendKeys("Pass@321");
	WebElement fradio =driver.findElement(By.xpath("(//label[@class='form-check-label'])[2]"));
	if(fradio.isSelected()==false)
	{
		Actions a = new Actions(driver);
	    a.doubleClick(fradio).perform();
		
	}
	else {
		System.out.println("Its already clicked");
	}
	
   WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
      Select s = new Select(Skills);
      s.selectByIndex(1);
      WebElement Techskills =driver.findElement(By.xpath("//select[@id='technicalskills']"));
      Select s1 = new Select(Techskills);
      s1.selectByValue("Selenium");
      WebElement country = driver.findElement(By.xpath("//select[@id='Country']"));
      Select s2= new Select(country);
      s2.selectByVisibleText("India ");
      WebElement presadd = driver.findElement(By.xpath("//textarea[@name='Present-Address']"));
      presadd.sendKeys("Andhrapradesh");
      WebElement peradd = driver.findElement(By.xpath("//textarea[@name='Permanent-Address']"));
      peradd.sendKeys("Andhrapradesh");
      
      WebElement pincode = driver.findElement(By.xpath("//input[@name='Pincode']"));
      pincode.sendKeys("534440");
      WebElement region = driver.findElement(By.xpath("//select[@id='Relegion']"));
      Select s3= new Select(region);
      s3.selectByVisibleText("Hindu");
      WebElement file =driver.findElement(By.xpath("//input[@name='file']"));
      file.sendKeys("C:\\Users\\B N D MOUNIKA\\Documents\\doc_cert.pdf");
      
      WebElement ready =driver.findElement(By.xpath("//label[contains(text(),' ready to relocate')]"));
  	if(ready.isSelected()==false)
  	{
  		System.out.println("link is selecting");
  		Actions a = new Actions(driver);
  	    a.click(ready).perform();
  	  System.out.println("link is selected");
  	}
  else {
  		System.out.println("Its already clicked");
  	}
  	//WebElement Submit =driver.findElement(By.xpath("//button[@name='Submit']"));
 //	Submit.click();
  	//driver.switchTo().alert().accept();
  	driver.navigate().refresh();
	}
	
}
