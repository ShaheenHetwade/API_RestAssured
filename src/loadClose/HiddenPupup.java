package loadClose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPupup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;     
        WebElement un=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		WebElement ps=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		WebElement uns=driver.findElement(By.id("username"));
		uns.sendKeys(un.getText());
		WebElement pss=driver.findElement(By.name("pwd"));
        pss.sendKeys(ps.getText());
        WebElement log=driver.findElement(By.id("loginButton"));
        System.out.println(log.isDisplayed());
        log.click();
        driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
        driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();       
        WebElement text = driver.findElement(By.xpath("//span[text()='© 2021 actiTIME Inc. All rights reserved.']"));
        System.out.println(text.getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='aboutPopupCloseButtonId']")).click();

        

	}

}
