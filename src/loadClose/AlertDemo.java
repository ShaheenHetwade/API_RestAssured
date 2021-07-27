package loadClose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//need to switch to alert then perform actions:
public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.id("alertButton")).click();
			//driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			WebElement send=driver.findElement(By.id("promtButton"));
			send.click();

			Alert a=driver.switchTo().alert();
			Thread.sleep(2000);
			/*a.sendKeys("shaheen");
			Thread.sleep(2000);
			a.accept();
			WebElement res=driver.findElement(By.id("promptResult"));------------------------------->for send values
			System.out.println(res.getText());*/

			/*a.accept();
			System.out.println(a.getText());
			a.accept();----------------------------------------->for accept
			System.out.println(a.getText());*/
           /* a.dismiss();
            WebElement errmessage=driver.findElement(By.id("confirmResult"));-------------------->for dismiss
			System.out.println(errmessage.getText());*/

			



	}

	}
