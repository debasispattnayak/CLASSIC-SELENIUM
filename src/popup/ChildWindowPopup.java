package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.skillrary.com/");
		
		String parentid = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[.=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[.=' SkillRary Essay'])[2]")).click();
		
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles)
		{
			System.out.println(handle);
			String currentTitle = driver.switchTo().window(handle).getTitle();
			if(currentTitle.contains("Essay"))
			{
				break;
			}
		}
		driver.findElement(By.id("mytext")).sendKeys("demo");
		driver.switchTo().window(parentid);
		
	}
}
