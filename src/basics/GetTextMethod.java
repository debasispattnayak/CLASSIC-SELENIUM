package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//		WebElement text1= driver.findElement(By.xpath("//img[@alt='Facebook']")); //cant do on image type
//		String str1=text1.getText();
		WebElement text2=driver.findElement(By.xpath("//h2[contains(text(),Facebook)]"));
		String str2=text2.getText();
		System.out.println(str2);
		driver.close();

	}

}
