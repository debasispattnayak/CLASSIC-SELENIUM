import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.RegEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForReplacement;

public class MakeMYTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		Thread.sleep(2000);
		act.moveByOffset(10, 10).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(4000);
		act.moveByOffset(10, 10).click().perform();
		try {
		WebElement ele = driver.findElement(By.xpath("//p[text()='Airlines']/following::p[@class='appendBottom15']/span[contains(text(),'more')]"));
		ele.click();
		}catch (Exception e) {
			// TODO: handle exception
		}
	//	JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,500)");
		
		
		//TreeMap<Integer, WebElement> map=new TreeMap<Integer, WebElement>();
		//List<WebElement> checkbox = driver.findElements(By.xpath("//p[.='Airlines']/following::span[@class='filterName']/preceding-sibling::span"));
		List<WebElement> airlines = driver.findElements(By.xpath("//p[.='Airlines']/following::span[@class='filterName']"));
		//ArrayList<Integer> list=new ArrayList<Integer>();
		int length=airlines.size();
		int[] a=new int[length];
		int i=0;
		for(WebElement el:airlines) {
			String pname=el.getText();
			String pid = pname.replaceAll("[^0-9]","");
			 int id=Integer.parseInt(pid);
			 a[i]=id;
			 i++;
			}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for(int j=0;j<3;j++) {
			for(WebElement e:airlines) {
				String name=e.getText();
				String d = name.replaceAll("[^0-9]","");
				 int dn=Integer.parseInt(d);
				 if(dn==a[j]) {
					 e.click();
					 Thread.sleep(2000);
				 }
			}
		}
	}

}
