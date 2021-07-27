package loadClose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.close();
	    WebElement id=driver.findElement(By.id("email"));
		id.sendKeys("shaheenetwade18@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Shaheen@18");                                      //WebElement method =sendKeys();
		WebElement login=driver.findElement(By.name("login"));
		login.click();;
		
		
		/*Thread.sleep(5000);
		driver.close();*/
		
	}


	}


