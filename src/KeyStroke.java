import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyStroke {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement UN=driver.findElement(By.id("email"));
		UN.sendKeys("8984183701");
		UN.sendKeys(Keys.CONTROL+"ac");
		WebElement PWD=driver.findElement(By.name("pass"));
		PWD.sendKeys(Keys.CONTROL+"v");
		PWD.sendKeys(Keys.CONTROL+"a");
		PWD.sendKeys(Keys.DELETE);
		
	}

}
