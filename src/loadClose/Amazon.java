package loadClose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
//driver.close();
	}

}
Problems encountered while deleting resources.
Could not delete 'C:\Users\Admin\eclipse-workspace\Bookroom\Software\chromedriver.exe'.
  Problems encountered while deleting files.
    Could not delete: C:\Users\Admin\eclipse-workspace\Bookroom\Software\chromedriver.exe.
    C:\Users\Admin\eclipse-workspace\Bookroom\Software\chromedriver.exe
