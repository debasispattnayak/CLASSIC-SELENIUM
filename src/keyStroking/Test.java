package keyStroking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone"+Keys.ENTER);
		WebElement phone = driver.findElement(By.xpath("//span[contains(text(),'SAMSUNG') and contains(text(),'S21')]"));
		JavascriptExecutor exe=(JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click();",phone); //CLICKING BY USING JAVASCRIPT EXECUTOR
		driver.quit();
	}

}
