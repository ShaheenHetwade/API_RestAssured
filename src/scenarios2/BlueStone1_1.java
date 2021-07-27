package scenarios2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//plain 20gm gold coin and verify
public class BlueStone1_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement coins=driver.findElement(By.xpath("//li[@id='goldCoins']"));
        a.moveToElement(coins).perform();;
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul/li[5]/span[text()='20 gram']")).click();
	    WebElement expected=driver.findElement(By.xpath("//ul/li[5]/span[text()='20 gram']"));
        String s=expected.getText();
        System.out.println("expected"+s);
	    //String s="50 gram";--------------------------------------------------------------------->unexpected 
        WebElement actual=driver.findElement(By.xpath("//span[text()='(20 gram)']"));
        String s2=actual.getText();
        System.out.println("actual"+s2);
        //SoftAssert st=new SoftAssert();
        //st.assertEquals(s, s2);----------------------------------------------------------------->need to use assertAll()
        Assert.assertEquals(s,s2);
        System.out.println("confirmed");

	    
	}

}

//span[text()='20']