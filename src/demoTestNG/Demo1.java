package demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
@Test(invocationCount=5)
public void TC_1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
}
}
