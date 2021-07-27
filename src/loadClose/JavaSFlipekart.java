package loadClose;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSFlipekart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		/*Thread.sleep(5000);
		j.executeScript("200, 0");---------->x axis
		j.executeScript("-200, 0");

		*/
		j.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		j.executeScript("window.scrollTo(-document.body.scrollWidth,0)");

	}

}
