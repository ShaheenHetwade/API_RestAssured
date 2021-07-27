import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://www.google.com");
driver.navigate().to("https://www.google.com");
driver .manage().window() .maximize();//maximize the window
String title=driver.getTitle();//print the title
System.out.println(title);
/*Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();*/
String url=driver.getCurrentUrl();
System.out.println(url);
//driver.quit();
//driver.close();

	}

}
