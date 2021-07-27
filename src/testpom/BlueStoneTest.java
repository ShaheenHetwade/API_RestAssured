package testpom;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.BlueStone;

public class BlueStoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().window().maximize();
			//Thread.sleep(10000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			BlueStone b1=new BlueStone(driver);
			b1.sendext("ring");
			b1.getring();
			Set<String> windows = driver.getWindowHandles();
			for(String win:windows)
			{
				driver.switchTo().window(win);
			}
			b1.buy();
System.out.println(b1.geterr());			
			
			
	}

}
