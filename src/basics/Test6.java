package basics;
//ASSIGNMENT TO USE partialLinkText
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("Debasis");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.partialLinkText("your")).click();
		
		
//		Thread.sleep(5000);
//		driver.findElement(By.id("loginPasswordPage")).click(); //click on return to home

	}

}
