package testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.BlueStone10;

public class BlueStone10Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement frames=driver.findElement(By.xpath("//iframe[@name='chat-widget']"));
		driver.switchTo().frame(frames);
		Thread.sleep(2000);
		BlueStone10 b1=new BlueStone10(driver);
		b1.chatwith();
		b1.name("samba");
		b1.email("samba@123");
		Thread.sleep(1000);
		b1.phnno("8563265456");
        b1.start();
        b1.message("hii");
        String replay=b1.replay();
        System.out.println(replay);
        
        
        
}
}