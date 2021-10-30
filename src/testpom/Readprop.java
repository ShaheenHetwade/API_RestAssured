package testpom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Readprop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().window().maximize();
			WebElement ring=driver.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
			Actions a=new Actions(driver);
			a.moveToElement(ring).perform();
			WebElement diamond=driver.findElement(By.xpath("//a[@title='Diamond Rings']"));
			diamond.click();
			Actions ac=new Actions(driver);
			WebElement Search=driver.findElement(By.xpath("//span[text()='Price']"));
			ac.moveToElement(Search);
			Search.click();
			List<WebElement>listtt=driver.findElements(By.xpath("//div[@class=\"form-items\"]/div/span"));
			for(WebElement li:listtt)
			{
				System.out.println(li.getText());
			}
	}

}
