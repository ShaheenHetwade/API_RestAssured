package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
		
       name.sendKeys("shaheen");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("hhhh");
		Thread.sleep(2000);
		WebElement passward=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		passward.sendKeys("abc#123");
		
	/*WebElement passward=driver.findElement(By.id("password_step_input"));
	
	passward.sendKeys("abc#123");*/

	}
	
}
