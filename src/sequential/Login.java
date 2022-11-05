package sequential;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Login {
	
	WebDriver driver=null;
	@BeforeMethod
	public void openapp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void logintoapp()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Reporter.log(driver.getTitle(),true);
		String title = driver.getTitle();
		
		Assert.assertEquals(title,"Facebook � log in or sign up");
		
		SoftAssert sa=new SoftAssert();
		//sa.assertEquals(title,"255sdad");
		
		
		Reporter.log(driver.getCurrentUrl(),true);
		//sa.assertAll();
		
	}
	@AfterMethod
	
	public void closeapp()
	{
		driver.close();
		Reporter.log("app closed");
	}

}
