package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	 	
	@Test(priority = -1)
	public void setting()
	{
		Reporter.log("setting",true);
	}
	
	@Test(priority = -1) 
	public void chat()
	{
		Reporter.log("chat",true);
	}
	
	@Test
	public void call()
	{
		Reporter.log("call",true);
	}
	
	

}
