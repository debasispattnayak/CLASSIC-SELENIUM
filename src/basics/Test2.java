package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		WebDriver driver1=new FirefoxDriver();
		WebDriver driver2=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver1.get("https://www.facebook.com/");
		driver2.get("https://www.qspiders.com/");
		driver.getTitle();
		
		
		
	//	driver.close();
	}

}
