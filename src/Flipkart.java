import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div[@class='_1AtVbE col-12-12']//div[contains(text(),'APPLE')]"));
		for(WebElement el:ele) {
			if(el.getText().contains("64 GB")) {
				System.out.println(el.getText());
			}
		}
		
		driver.quit();
	}
}
