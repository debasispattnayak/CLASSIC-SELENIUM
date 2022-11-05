package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		driver.findElement(By.id("search")).sendKeys("new songs");
		//driver.findElement(By.cssSelector("input[id='search']")).sendKeys("new songs");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		

	}

}
