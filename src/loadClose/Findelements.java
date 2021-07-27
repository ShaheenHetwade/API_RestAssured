package loadClose;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement close=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		List<WebElement> menues=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for(WebElement menu:menues)
		{
			System.out.println(menu.getText());
		}
		
	}

}
