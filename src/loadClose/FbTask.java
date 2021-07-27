package loadClose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createaccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button' ]"));
		System.out.println(createaccount.isDisplayed());             	//WebElement method =isDisplayed();
		System.out.println(createaccount.isEnabled());   	            //WebElement method =isEnabled();
        createaccount.click();                                          //WebElement method =click();
	}
 
}
