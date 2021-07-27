package demoTestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
@Test(priority=1)
public void login()
{
	System.out.println("login");
}
@Test(dependsOnMethods="login")
public void chat()
{
	System.out.println("chat");
}
@Test(dependsOnMethods="chat")
public void text()
{
	System.out.println("text");
}
}
