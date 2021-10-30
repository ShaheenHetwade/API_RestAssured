package scenarios2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//plain gold coin 50 gm and verify
public class BlueStone2_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		//Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement coins=driver.findElement(By.xpath("//li[@id='goldCoins']"));
        coins.click();      
        Thread.sleep(2000);
	    WebElement coins1=driver.findElement(By.xpath("//span[text()='50']"));
	    coins1.click();
	    driver.findElement(By.id("pid_5925")).click();
	    Thread.sleep(1000);
	    WebElement selectedgrm=driver.findElement(By.xpath("//span[text()='(50 gram)']"));
	    Assert.assertEquals(coins1,selectedgrm );
	    System.out.println("ssdfg");
	}

}
