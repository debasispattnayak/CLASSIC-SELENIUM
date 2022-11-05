package dropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetText {

	public static void main(String[] args) {
	

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		
		WebElement dropdown = driver.findElement(By.name("url"));
		Select s=new Select(dropdown);
		List<WebElement> alloptions = s.getOptions();
		System.out.println("Total elements in dropdown is "+alloptions.size());
		
		
		for(WebElement opt:alloptions)
		{
			System.out.println(opt.getText());
		}
		driver.close();

	}

}
