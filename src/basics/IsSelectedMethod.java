package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		WebElement button = driver.findElement(By.name("sex"));
		if(button.isSelected())
		{
			System.out.println("PASS: selected");
		}
		else
		{
			System.out.println("FAIL:not selected");
			//button.click();
		}
		
		driver.close();
	}

}
