package basics;
//AUTOMATE LOGIN SCENARIO
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("demo");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String title=driver.getTitle();
		if(title.equals("actiTIME - Login"))
		{
			System.out.println("PASS:Home page dissplayed");
		}
		else
		{
			System.out.println("FAIL:Home page not displayed");
		}
	
		String url=driver.getCurrentUrl();
		System.out.println("Page title is "+title+"\n"+"URL is "+url);
	
		driver.close();

	}

}
