package scrollbar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroollBar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//TYPECASTING
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//SCROLL TOP TO BOTTOM
		js.executeScript("window.scrollBy(0,5000)");
		//SCROLL BOTTOM TO TOP
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-5000)");
		driver.close();
		
		
	}

}
