package basics;
import org.openqa.selenium.By;
//CSS SELECTOR EXPRESSION(COUNT SHOULD BE 1 OF 1)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test7 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("8984183701");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Debasis$123");
		driver.findElement(By.cssSelector("button[value='1']")).click();	

	}

}
