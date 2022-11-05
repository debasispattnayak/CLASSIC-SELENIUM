package sequential;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgoPWD {
	
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
		driver.findElement(By.linkText("Forgotten password?")).click();
	}
	@AfterMethod
	
	public void closeapp()
	{
		driver.close();
		Reporter.log("app closed");
	}

}
