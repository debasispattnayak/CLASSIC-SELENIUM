package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		
		WebElement dropdown = driver.findElement(By.name("url"));
		Select s=new Select(dropdown);
		
		
		s.selectByIndex(7);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby-products-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Deals");
		s.deselectAll();
		driver.close();
	}

}
