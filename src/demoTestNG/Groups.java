package demoTestNG;

import org.testng.annotations.Test;

public class Groups {
@Test(groups="smoke")
public void t1()

{
	System.out.println("running smoke1");

}
@Test(groups="fun",dependsOnGroups="smoke")
public void t2()

{
	System.out.println("running functional 1");
}
@Test(groups="smoke")
public void t3()

{
	System.out.println("running smoke2");
}
@Test(groups="inte",dependsOnGroups="fun")
public void t4()

{
	System.out.println("running integration 1");

}
@Test(groups="fun",dependsOnGroups="smoke")
public void t5()

{
	System.out.println("running functional 1");

}
@Test(groups="inte",dependsOnGroups="fun")
public void t6()

{
	System.out.println("running integration 2");
}
}
