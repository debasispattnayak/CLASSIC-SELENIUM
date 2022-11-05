package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//TYPECASTING
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//ACCESS THE METHOD AND STORE IT IN RAM
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//SPECIFY THE LOCATION FOR STORING
		File dest=new File(".\\photo\\amazon.png");
		
		//COPY FROM RAM AND PASTE TO DESTINATION FOLDER
		
		FileUtils.copyFile(src, dest);
		driver.close();
		
	}
}
