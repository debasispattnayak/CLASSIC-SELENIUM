package actionclass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// for resizing browser
		
//		Dimension d=new Dimension(60,30);
//		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(block3, block2).perform();
	}

}
