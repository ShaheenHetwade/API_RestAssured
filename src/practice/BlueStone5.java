package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
			List <WebElement> DefaultP=driver.findElements(By.xpath("//span[@class='prcs-dlh']/parent::div"));
			for(WebElement sub: DefaultP)
			{
				System.out.println(sub.getText());
				
			}
			Thread.sleep(2000);
			WebElement sort=driver.findElement(By.xpath("//span[text()=' Popular ']"));
			a.moveToElement(sort).perform();
			WebElement PriceLtoH=driver.findElement(By.xpath("//a[contains(.,'Price Low to High ')]"));
			PriceLtoH.click();
			driver.findElement(By.xpath("//span[text()='Price']")).click();
			List<WebElement> sortedp=driver.findElements(By.xpath("(//div[@class=\"form-items\"])[1]"));
			for(WebElement sp:sortedp)
			{
				System.out.println("sorted price");

				System.out.println(sp.getText());
			}
				        //driver.close();
	}

}
