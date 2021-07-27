package loadClose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
//if button is enabled send the text
public class EnableDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/EnableDisable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,10);
		ww.until(new ExpectedCondition<Boolean>() {
			
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.id("xyz")).isEnabled();
			}
		});
		driver.findElement(By.id("xyz")).sendKeys("shaheen");
	
	}

}
