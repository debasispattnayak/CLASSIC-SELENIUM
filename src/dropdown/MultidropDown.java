package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultidropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		s.selectByValue("299");
		//s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		
		s.deselectByIndex(2);
		s.deselectByValue("299");
		//s.deselectByVisibleText("More Than INR 500 ( 55 ) ");
		
		//method to find that dropdown is multidropdown or not and deselect all
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}

	}

}
