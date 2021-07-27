package scenarios2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//1gm Gold coins
public class BlueStone14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		WebElement coins=driver.findElement(By.xpath("//a[text()='Coins ']"));
        coins.click();
		WebElement coin1gm=driver.findElement(By.xpath("//div[@class='filter 1gms']"));
		coin1gm.click();

	}

}
