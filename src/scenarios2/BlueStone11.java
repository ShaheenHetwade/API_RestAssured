package scenarios2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//select 0% off making charges
public class BlueStone11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		//Actions
		//driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li[10] ")).click();
		driver.findElement(By.xpath("//span[contains(.,'Upto 20% Making Charges Off on Plain Gold Jewellery')]")).click();
	}

}
