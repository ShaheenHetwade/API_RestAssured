package testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripTest {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.makemytrip.com/flights");
	        driver.manage().window().maximize();
	       /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(2000);
	        WebElement popup = driver.findElement(By.xpath("//div[@class='paddingLR20']"));
	        WebElement close = driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']"));
	        if(popup.isDisplayed())
	        {
	        	close.click();
	        }*/
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(2000);
	        }
}
