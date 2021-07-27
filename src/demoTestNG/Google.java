package demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google {
	@Test
	@Parameters("browser")
	public void tc(String browser) throws InterruptedException
	{
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
           driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	         driver=new FirefoxDriver();

		}
		else
		{
			driver=null;
		}
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(1000);
		//driver.close();
		
	}

}
