package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//typing
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.xpath("(//input[@type='text'])[2]")); 
		w.until(ExpectedConditions.visibilityOf(username)).sendKeys("dev");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("devil");
		//click
		WebElement loginbtn= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		w.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();
		
		//loading login to home page and getting title
		String title=driver.getTitle();
		w.until(ExpectedConditions.titleContains("flipkart"));
		
		System.out.println(title);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("PASS: Home Page Displayed");
		}
		else
		{
			System.out.println("FAIL: Home page not displayed");
		}
		System.out.println("current URL is: "+driver.getCurrentUrl());
		driver.close();
	}

	}


