package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadderT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		/*WebElement store=driver.findElement(By.xpath("//ul[@class='topnav bodytext']"));
		System.out.println(store.getText());*///**********with findELEMENT
		List<WebElement>menues=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));///WITH fINDeLEMENTS
for(WebElement menuName:menues)
{
	System.out.println(menuName.getText());
}

	}

}
