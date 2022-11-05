package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void testScript01()
	{
		Reporter.log("Hellow selenium",true);
		Reporter.log("Hello java",false);
	}

}
