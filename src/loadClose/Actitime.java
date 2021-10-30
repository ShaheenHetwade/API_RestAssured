package loadClose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		WebElement ps=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		WebElement uns=driver.findElement(By.id("username"));
		uns.sendKeys(un.getText());
		WebElement pss=driver.findElement(By.name("pwd"));
        pss.sendKeys(ps.getText());
        WebElement log=driver.findElement(By.id("loginButton"));
        System.out.println(log.isDisplayed());
        log.click();
        driver.close();
		/*WebElement id=driver.findElement(By.id("username"));
		id.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		WebElement log=driver.findElement(By.id("loginButton"));
		log.click();*/

	}

}
