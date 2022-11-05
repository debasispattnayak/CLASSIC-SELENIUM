package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//LOCATORS
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8984183701"); //ENTERING UN
		driver.findElement(By.name("pass")).sendKeys("Debasis$123"); //ENTERING PWD
		driver.findElement(By.name("login")).click(); //CLICK ON LOG IN
		
		
		driver.findElement(By.linkText("https://scontent.fbbi1-1.fna.fbcdn.net/v/t39.30808-1/291445819_2825035094465361_1282740194834458372_n.jpg?stp=cp0_dst-jpg_p60x60&_nc_cat=100&ccb=1-7&_nc_sid=7206a8&_nc_ohc=4JlvEn-eP-gAX9MZGbm&_nc_ht=scontent.fbbi1-1.fna&oh=00_AT8wS5YDn5C4WQHGZHL_nTw7EtcBKV6wvcmSm7b7PHDopg&oe=62F67DB9")).click();
		driver.findElement(By.className("d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j fe6kdd0r mau55g9w c8b282yb keod5gw0 nxhoafnm aigsh9s9 d3f4x2em iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m")).click();
	}

}
