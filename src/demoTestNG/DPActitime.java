package demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DPActitime {
	@Test(dataProviderClass=demoTestNG.DPReadData.class,dataProvider="read")
	public void tc(String user,String pass) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.id("username")).sendKeys(user);
	    driver.findElement(By.name("pwd")).sendKeys(pass,Keys.ENTER);

}
}