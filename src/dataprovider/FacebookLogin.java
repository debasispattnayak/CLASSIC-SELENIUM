package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] o=new Object[3][2];
		o[0][0]="dev";
		o[0][1]="dev@123";
		
		o[1][0]="123456";
		o[1][1]="dadafaf";
		
		o[2][0]="afbsjkbkfabfj^&***266";
		o[2][1]="rajath";
		return o;		
	}
	
	@Test(dataProvider = "data")
	public void Login(String UN,String PWD)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(PWD);
		driver.close();
	}

}
