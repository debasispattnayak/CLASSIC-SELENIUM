package mypackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.linkedin.com/");
		
		//This method will be like hardcoding one
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles)
		{
			String currentTitle = driver.switchTo().window(handle).getTitle();
			if(currentTitle.contains("Facebook"))
			{
				break;
			}
		}
		
		
	
	}
	
	/**
	 * This method is a generic one
	 * @param driver
	 * @param partialText
	 */
	public static void switchWindow(WebDriver driver,String partialText)
	{
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		while(it.hasNext())
		{
			String windowid = it.next();
			String currentTitle = driver.switchTo().window(windowid).getTitle();
			if(currentTitle.contains(partialText))
			{
				break;
			}
		}
					
	}
}
