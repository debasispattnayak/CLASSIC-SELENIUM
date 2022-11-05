package basics;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//USING LinkText and partialLinkText
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		driver.findElement(By.name("email")).sendKeys("8984183701");
		
	}

}
