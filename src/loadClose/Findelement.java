package loadClose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		/*WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("shaheen");
		Thread.sleep(5000);
		driver.close();*/
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("shaheen");
		Thread.sleep(5000);
		driver.close();
		
	}

}
