package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class RollsTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
         /*ChromeOptions op=new ChromeOptions();    
         op.addArguments("--disable-notifications");*/
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.rolls-roycemotorcars.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     


	        
	}

}
