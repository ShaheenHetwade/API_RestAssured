package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//monthly plan
public class Bluestone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]")).click();;
		driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]")).click();;
		WebElement amount=driver.findElement(By.xpath("//input[@id='amount']"));
		amount.sendKeys("1000");
		
		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
		mail.sendKeys("dinga@gmail.com");
		WebElement start=driver.findElement(By.xpath("//input[@id='gmsStart']"));
        start.click();
    	System.out.println(driver.getTitle());
    	

		//input[@id='gmsStart']
		//input[@id='amount']
		//input[@id='Email']

		
	
	}

}
