package loadClose;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("java",Keys.ENTER);
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
       /* js.executeScript("window.scrollBy(0,1000)");--------------->y axis
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-500)");*/
        /*js.executeScript("window.scrollTo(0,document.body.scrollHeight)");----------------------->Full y axis scroll
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");*/
        WebElement ele = driver.findElement(By.xpath("//h3[text()='Oracle Java Technologies | Oracle']"));
        js.executeScript("arguments[0].scrolltoView()",ele);
	}

}
