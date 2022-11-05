package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOptions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		s.selectByValue("299");
		
		
		List<WebElement> opt = s.getAllSelectedOptions();
		for(WebElement selected:opt)
		{
			System.out.println(selected.getText());
		}
		
		driver.close();
	}

}
