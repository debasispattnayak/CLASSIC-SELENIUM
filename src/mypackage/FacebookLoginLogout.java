package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginLogout {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement UN=driver.findElement(By.id("email"));
		UN.sendKeys("8984183701");
		WebElement PWD=driver.findElement(By.name("pass"));
		PWD.sendKeys("Debasis$123");
		WebElement loginbtn=driver.findElement(By.name("login"));
		loginbtn.click();
		
		driver.findElement(By.cssSelector("image[style='height:40px;width:40px']")).click();

		driver.findElement(By.xpath("//i[contains(@style,'background-position: 0px -74px')]")).click();
		
		

	}

}
