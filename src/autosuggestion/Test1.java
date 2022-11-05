package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("phon");
		Thread.sleep(3000);
		List<WebElement> suggestions = ele.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		
		System.out.println("total suggested elements "+suggestions.size());
		for(WebElement allsug:suggestions)
		{
			System.out.println(allsug.getText());
		}
		driver.close();
	}
}
