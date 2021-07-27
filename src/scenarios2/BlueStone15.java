package scenarios2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//plain 2gm Gold coins
public class BlueStone15 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().window().maximize();
			WebElement coins=driver.findElement(By.xpath("//a[text()='Coins ']"));
	        coins.click();
			WebElement coins2gm=driver.findElement(By.xpath("//div[@class='filter 2gms']"));
	        coins2gm.click();
		}

	

	}


