package demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodParall {
@Test
public void tc1()
{
	System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
}
@Test
public void tc2()
{
	System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);

}
}
