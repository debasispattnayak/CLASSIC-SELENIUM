package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Navigate
public class Test3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver(); //opening empty browser
		driver.get("https://www.amazon.in/"); //get the URL and wait until loading
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize(); //for maximize window
		Thread.sleep(2000);  //for 2 sec delay not required during actual automation
		driver.navigate().back(); //back page
		driver.navigate().to("https://www.snapdeal.com/"); //Navigating to other URL
		Thread.sleep(2000);
		driver.navigate().forward(); //forward page
		Thread.sleep(2000);
		driver.navigate().refresh(); //refresh page
		
		driver.manage().window().minimize();//for minimize window
		driver.manage().window().fullscreen(); //for full screen window

		
		
		driver.close(); //close page
		
		

	}

}
