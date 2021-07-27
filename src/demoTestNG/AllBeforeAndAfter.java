package demoTestNG;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllBeforeAndAfter {
@BeforeClass
public void tc()
{
	System.out.println("Running BeforeClass");

}
@BeforeTest
public void tc1()
{
	System.out.println("Running BeforeTest");

}
@BeforeMethod
public void tc3()
{
	System.out.println("Running BeforeMethod");

}
@Test
public void tc4()
{
	System.out.println("Running Test");

}
@AfterMethod
public void tc5()
{
	System.out.println("Running AfterMethod");

}
@AfterTest
public  void tc6()
{
	System.out.println("Running AfterTest");

}
@AfterClass
public void tc7()
{
	System.out.println("Running AfterClass");
}

}
