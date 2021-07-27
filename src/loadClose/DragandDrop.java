package loadClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
        //driver.manage().window().maximize();
        WebElement drag=driver.findElement(By.xpath("//a[contains(.,'Draggable')]"));
        WebElement drop=driver.findElement(By.xpath("//a[text()='Droppable']"));
        Thread.sleep(2000);
        Actions a=new Actions(driver);
        a.dragAndDrop(drag, drop).perform();
        Thread.sleep(5000);
        System.out.println(drop.getText());                                   //WebElement method =getText();
        String property=drop.getCssValue("background-color");//getCssValue()
        System.out.println(property);
        System.out.println(drag.getAttribute("id"));//getAttribute()
	}


	}

