package demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMandAM {

	WebDriver driver;
	@BeforeMethod
	public void bm()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("bm");

	}
	@Test
	public void tc_1() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		System.out.println("tc1");
	}
	@Test
	public void tc_2() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("testNG",Keys.ENTER);
		System.out.println("tc2");
	}
	@AfterMethod
	public void am()
	{
		driver.close();
		System.out.println("am");
	}
}


