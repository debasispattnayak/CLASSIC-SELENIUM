package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverAndDoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement course = driver.findElement(By.id("course"));
		
		Actions a=new Actions(driver); //FOR MOUSEOVER AND DOUBLE CLICK USE THIS REFERENCE
		a.moveToElement(course).perform(); //MOUSEHOVER
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		
		WebElement plus = driver.findElement(By.id("add"));
		a.doubleClick(plus).perform(); //DOUBLE CLICK
		
	}

}
