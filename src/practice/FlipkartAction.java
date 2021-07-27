package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions a=new Actions(driver);
		List<WebElement> menu=driver.findElements(By.xpath("//div[@class='xtXmba']"));

		for(WebElement menuee:menu)
		{
			String name=menuee.getText();
			System.err.println(name);                                                                                                                         
		//System.out.println(menuee.getText());
		a.moveToElement(menuee).perform();
		//Thread.sleep(2000);
		List<WebElement>submenues=driver.findElements(By.xpath("//div[contains(.,'"+menuee+"')]/descendant::div[@class='_3XS_gI _7qr1OC']/a"));
		for( WebElement subm:submenues)
		{
			System.out.println(subm.getText());
		}
 
		}
	} 
}