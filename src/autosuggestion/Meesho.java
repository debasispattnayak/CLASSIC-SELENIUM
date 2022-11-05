package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.meesho.com/");
		
		WebElement el = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		el.click();
		el.sendKeys("saree");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='Card__BaseCard-b3n78k-0 cvPSDP autosuggest autosuggest__desk autosuggest autosuggest__desk']"));
		
		for(WebElement ele:list)
		{
			System.out.println(ele.getText());
		}
		driver.close();
	
	}

}
