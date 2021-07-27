package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//click on buy and capture error page is displayed or not
public class BlueStone7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		WebElement jwellary=driver.findElement(By.xpath("//li[@class='menuparent']"));
		Actions a=new Actions(driver);
		a.moveToElement(jwellary).perform();
		WebElement kadas=driver.findElement(By.xpath("//span[contains(.,'Kadas')]"));
		kadas.click();
		WebElement Selkada=driver.findElement(By.xpath("//div[@class='p-image']"));
		Selkada.click();
		Set<String>tabs=driver.getWindowHandles();
		for(String tab:tabs)
		{
			driver.switchTo().window(tab);
		}
		WebElement buy=driver.findElement(By.xpath("//input[@type='submit']"));
		buy.click();
		//driver.close();
	}

}
