package basics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoacationMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement	email=driver.findElement(By.id("email"));
		Point loc=email.getLocation();
		System.out.println(loc.getX()+" X cooridnate");
		System.out.println(loc.getY()+" Y coordinate");
		driver.close();

	}

}
