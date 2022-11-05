package scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementAndClick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//BY USING LOCATION METHOD
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Shop Laptops & Tablets']"));
		Point loc = ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		//TYPECASTING
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//SCROLL TO THE ELEMENT LOCATION
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		//CLICK
		ele.click();
		
	}

}
