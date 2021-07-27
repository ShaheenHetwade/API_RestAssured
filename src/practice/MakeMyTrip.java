package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
       /* WebElement popup= driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']"));
        popup.click();
        Thread.sleep(1000);
        popup.click();*/
       /*if( driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).isDisplayed())
       {
         driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).click();

       }
        WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
        from.click();
        //Actions a=new Actions(driver);
        //a.moveToElement(from).click();*/
       /* WebElement popup = driver.findElement(By.xpath("//div[@class='paddingLR20']"));
        WebElement close = driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']"));
        if(popup.isDisplayed())
        {
        	close.click();
        	driver.findElement(By.xpath("//section[@class='modalMain ']")).click();  
        	}*/


        WebElement fromcity=driver.findElement(By.xpath("//p[text()='Mumbai, India']"));
        fromcity.click();
        WebElement tocity=driver.findElement(By.xpath("//p[text()='Delhi, India']"));
        tocity.click();
        WebElement date=driver.findElement(By.xpath("//p[text()='19']"));
        date.click();
        WebElement Search=driver.findElement(By.xpath("//a[text()='Search']"));
        Search.click();
        driver.findElement(By.xpath("//label[@class='makeFlex spaceBtwCenter appendBottom12 pointer ']")).click();
        driver.findElement(By.xpath("//p[text()='₹ 5,313']")).click();
        driver.findElement(By.xpath("//span[text()='View Prices']")).click();
        driver.findElement(By.xpath("//button[text()='Book Now']")).click();
        driver.findElement(By.xpath("//div/div[3]/label/input[@type='radio']")).click();
        driver.findElement(By.xpath("//span[@class='check']")).click();


        
	}

}
