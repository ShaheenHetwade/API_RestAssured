package demoTestNG;

import org.testng.annotations.Test;

public class Enable {

	@Test(enabled=false)
	public void tc()
	{
		System.out.println("running tc");
	}
	}


