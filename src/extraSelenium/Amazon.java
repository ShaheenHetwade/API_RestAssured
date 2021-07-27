package extraSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import loadClose.TakeScreenShot;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//closewindow
			driver.findElement(By.xpath("//div[text()='Mobiles']")).click();//mobile
			TakesScreenshot ts=(TakesScreenshot)driver;
			File s=ts.getScreenshotAs(OutputType.FILE);
			File save=new File("./ScreenShot/.Flipkart.png");
	        Files.copy(s,save);

	}

}
