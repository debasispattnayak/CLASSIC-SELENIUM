package handlingpermissionpopup;

import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MicTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		HashMap<String, Integer> content_setting=new HashMap<String, Integer>();
		HashMap<String, Object> profile=new HashMap<String, Object>();
		HashMap<String, Object> preference=new HashMap<String, Object>();
		content_setting.put("media_stream",2); //1-->ACCEPT,2-->DISMISS/BLOCK
		profile.put("managed_default_content_settings", content_setting);
		preference.put("profile", profile);
		opt.setExperimentalOption("prefs",preference);
	
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mictests.com/");
		
		driver.findElement(By.id("mic-launcher")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
