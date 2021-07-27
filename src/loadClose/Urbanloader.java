package loadClose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Urbanloader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                                            //implicit wait
		//Thread.sleep(10000);                                                                                     //Thread
		WebElement close=driver.findElement(By.xpath("//a[@ class='close-reveal-modal hide-mobile']"));
		close.click();
		WebElement store=driver.findElement(By.xpath("//a[contains(.,' Stores ')]"));
		store.click();
		WebElement hpune=driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]"));
    	System.out.println(hpune.getText());
		hpune.click();


		//driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]")).click();;

		/*WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("sofa",Keys.ENTER);*/
	}

}
