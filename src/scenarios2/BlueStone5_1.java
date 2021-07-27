package scenarios2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//laxmi gold coin  10 gm
public class BlueStone5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement coins=driver.findElement(By.xpath("//li[@id='goldCoins']"));
        a.moveToElement(coins).perform();
        driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
        driver.findElement(By.xpath("//div[@class='filter 10gms']")).click();
        driver.close();
	}

}
