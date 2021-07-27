package demoTestNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	@Test
	public void tc()
	{
		String expected ="Shaheen";
		String actual="Shaheen";
		Assert.assertEquals(expected, actual);
		System.out.println("both are same ");
		List<Object>l1=new ArrayList<Object>();
		l1.add("maharashtra");
		l1.add("mumbai");
		l1.add("kolhapur");
		l1.add("sangli");
		List<Object>l2=new ArrayList<Object>();
		l2.add("maharashtra");
		l2.add("mumbai");
		l2.add("kolhapur");
		l2.add("sangli");
		//Assert.assertEquals(l1, l2);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("sha", "shh");//--------------------------->it will display result also if case is failed
		System.out.println("matched");
		sa.assertAll();//----------------------->it will display exception and also it will proceed further
		
	}
}
