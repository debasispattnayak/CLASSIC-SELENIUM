package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(enabled = false)
	public void chat()
	{
		Reporter.log("chat",true);
	}
	@Test
	public void setting()
	{
		Reporter.log("setting");
	}
	@Test(invocationCount = 3)
	public void call()
	{
		Reporter.log("call",true);
	}

}
