package scenarios2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//plain gold coin 50 gm and veify
public class BlueStone2_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement coins=driver.findElement(By.xpath("//li[@id='goldCoins']"));
        a.moveToElement(coins).perform();
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='50 gram']")).click();
	}

}
