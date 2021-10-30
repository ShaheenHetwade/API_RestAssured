package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//compare size of item n cart page with selected size
public class BlueStone8 {

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
        WebElement selSize=driver.findElement(By.xpath("//span[@class='ring-size-box']"));
        selSize.click();
        WebElement Size=driver.findElement(By.xpath("//span[text()='2-8(2 8/16\")']"));
        String s=Size.getText();
        Size.click();
        WebElement buy=driver.findElement(By.xpath("//input[@type='submit']"));
		buy.click();
		WebElement SizeF = driver.findElement(By.xpath("//span/span[text()='2-8(2 8/16\")']"));
        String s2=SizeF.getText();

		Assert.assertEquals(s,s2);
		System.out.println("confirmed");
	}

}
