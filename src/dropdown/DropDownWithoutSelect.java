package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DropDownWithoutSelect {
	
		public static void main(String[] args) {
			
		
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://myaccount.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Create a Google Account']")).click();
		
		driver.findElement(By.xpath("//span[text()='‪English (United Kingdom)‬']")).click();	
		driver.findElement(By.xpath("//div[@class='OA0qNb ncFHed']/div[@data-value='te']")).click();
		driver.quit();
		
		
		}

}
