package loadClose;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukari {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://naukri.com/");
		driver .manage().window() .maximize();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		Set<String> wi=driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(wi) ;
		
		for(int i=lst.size()-1;i>=0;i--)//for reverse order closing
		{
			String win=lst.get(i);
			driver.switchTo().window(win);
			driver.close();
		}
		/*wi.remove(parent);
		for(String win:wi)//for forwardclosing
		{
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
		}*/
	}

}
