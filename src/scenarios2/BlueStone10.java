package scenarios2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//chat our expertise
public class BlueStone10 {

	public static void main(String[] args) throws InterruptedException {                                   
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement frames=driver.findElement(By.xpath("//iframe[@name='chat-widget']"));
		driver.switchTo().frame(frames);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='lc-mmsuz6 e1dmt1bi0']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("samba");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sambaroy@gamil.com");
		driver.findElement(By.xpath("(//input[@class='lc-m2sc8j e1xplv9i0'])[3]")).sendKeys("9175619597");
		driver.findElement(By.xpath("//span[contains(.,'Start the chat')]")).click();
		driver.findElement(By.xpath("//div[@class='lc-1f7d9yq ex4ls1q0']/child::textarea")).sendKeys("hii",Keys.ENTER);
		/*WebElement reply=driver.findElement(By.xpath("//div/span[@class='Linkify']"));
		System.out.println(reply.getText());--------------->replay changing frequently   */
		WebElement replaytext=driver.findElement(By.xpath("(//div[@class=\"lc-1h0mrys eovu8nx0\"])[1]"));
		System.out.println(replaytext.getText());

		
	}

}//name="chat-widget"
//input[@name='name']
//input[(@id='iuwce9ebbso_146917605549304831')]id="swzi6al97c_146917605549304831"
//span[text()='Start the chat']