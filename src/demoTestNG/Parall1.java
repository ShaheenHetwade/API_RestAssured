package demoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parall1 {
	@Test
	public void tc1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.close();
	}
}
