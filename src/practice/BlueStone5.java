package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//compare by default price and sorted price,both list should vary by prices validate
public class BlueStone5 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().window().maximize();
			WebElement ring=driver.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
			Actions a=new Actions(driver);
			a.moveToElement(ring).perform();
			WebElement diamond=driver.findElement(By.xpath("//a[@title='Diamond Rings']"));
			diamond.click();
			driver.findElement(By.xpath("//span[text()='Price']")).click();
            List <WebElement> DefaultP=driver.findElements(By.xpath("(//div[@class=\"form-items\"])[1]"));
			for(WebElement sub: DefaultP)
			{
				System.err.println("bydefault price list");
				System.out.println(sub.getText());
				
			}
			Thread.sleep(2000);
			WebElement sort=driver.findElement(By.xpath("//span[text()=' Popular ']"));
			a.moveToElement(sort).perform();
			WebElement PriceLtoH=driver.findElement(By.xpath("//a[contains(.,'Price High to Low ')] "));
			PriceLtoH.click();
			driver.findElement(By.xpath("//span[text()='Price']")).click();
			List<WebElement> sortedp=driver.findElements(By.xpath("(//div[@class=\'form-items\'])[1]"));
			for(WebElement sp:sortedp)
			{
				System.err.println("sorted price");

				System.out.println(sp.getText());
			}
			if(DefaultP.size()==sortedp.size())
			{
			Assert.assertEquals(DefaultP,sortedp);
			System.out.println("hii");
			}
			else
			{
				System.out.println("size not same");
			}
				        //driver.close();
	}

}
