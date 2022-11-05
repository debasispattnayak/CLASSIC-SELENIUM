package scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementWithoutLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Shop Laptops & Tablets']"));
		//TYPECASTING
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//SCROLL TO ELEMENT
		js.executeScript("arguments[0].scrollIntoView();",ele);
		Thread.sleep(3000);
		
		//CLICK
		//ele.click();
		
		//CLICKING ELEMENT BY JAVASCRIPEXECUTOR(ALTERNATE TO CLICK)
		js.executeScript("arguments[0].click();",ele);
		
		driver.close();

	}

}
