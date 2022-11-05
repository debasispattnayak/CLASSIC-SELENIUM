package basics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement login=	driver.findElement(By.name("login"));
		
		Dimension dim=login.getSize();
		System.out.println(dim.getHeight()+" Height of login button");
		System.out.println(dim.getWidth()+" Width og login button");
		driver.close();

	}

}
