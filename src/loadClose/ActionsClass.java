package loadClose;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Actions using Actions class
public class ActionsClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement close=driver.findElement(By.xpath("//a[@ class='close-reveal-modal hide-mobile']"));
		close.click();
		Actions a=new Actions(driver);//object creation
		List<WebElement>menues=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));//for main menu
		for(WebElement menuName:menues)
		{
			String name=menuName.getText();
			System.err.println(name);
			//System.out.println(menuName.getText());
			a.moveToElement(menuName).perform();//calling non static method
			Thread.sleep(2000);
			TakeScreenShot.Takepic(driver, name);
			List<WebElement>submenues=driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
         for(WebElement subm:submenues)
         {
        	 System.out.println(subm.getText());//for submenu
         }
		}

   }
	//ul[@class='topnav bodytext']/li------------------------------------------------>1st path
	//span[contains(.,'Sale')]/parent::li------------------------------------------------------->2nd path(only display for sale)

}
