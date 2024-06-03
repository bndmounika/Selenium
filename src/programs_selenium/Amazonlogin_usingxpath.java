package programs_selenium;
//Ass -134 Login to  Amazon Application using Relative Xpath Syntax.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlogin_usingxpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement email =	driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("stbymkt@gmail.com");
		WebElement continuebutton = driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();
		WebElement Password =driver.findElement(By.xpath("//input[@id='ap_password']"));
		Password.sendKeys("password@123");
		WebElement Signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		Signin.click();
	}

}
