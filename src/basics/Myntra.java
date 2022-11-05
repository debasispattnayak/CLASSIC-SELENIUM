package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("7564123");
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
	}

}
