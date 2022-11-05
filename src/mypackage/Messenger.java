package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Messenger {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.facebook.com/");
		WebElement UN=driver.findElement(By.id("email"));
		UN.sendKeys("8984183701");
		WebElement PWD=driver.findElement(By.name("pass"));
		PWD.sendKeys("Debasis$123");
		WebElement loginbtn=driver.findElement(By.name("login"));
		loginbtn.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@aria-label='Messenger'])[1]")).click();
		Thread.sleep(5000);		
		driver.findElement(By.cssSelector("input[aria-label='Search Messenger']")).sendKeys("rajath");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='rajath_hm']")).click();
		Thread.sleep(5000);
	//	driver.findElement(By.cssSelector("div[aria-label='Attach a file']")).sendKeys("C:\\Users\\DEV\\pass");
		driver.findElement(By.xpath("//p[@class='m8h3af8h kjdc1dyq']")).sendKeys("Automated");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']")).click();

	}

}
