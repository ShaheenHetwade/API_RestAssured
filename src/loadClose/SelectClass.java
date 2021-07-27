package loadClose;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/Stask.html");
		driver.manage().window().maximize();
	   WebElement head=driver.findElement(By.xpath("//SELECT[@id='b']"));
	   Select s=new Select(head);
	   if(s.isMultiple())//select multiple options
	   {
		   s.selectByIndex(0);
		   Thread.sleep(1000);
		   s.selectByValue("323");
		   Thread.sleep(1000);
		   s.selectByVisibleText("324");
	   }
       List<WebElement> opt=s.getOptions();//fetch all options to console
       for(WebElement op:opt)
       {
    	   System.out.println(op.getText());
       }
       System.out.println("get first selected options:"+s.getFirstSelectedOption().getText());//for 1st selected option
       List<WebElement> AllOp=s.getAllSelectedOptions();//for all selected option
       for(WebElement all:AllOp)
       {
    	   System.out.println("get last selected options:"+all.getText());
       }
      s.deselectByIndex(0);//deselect multiple options 1 by 1
	   Thread.sleep(1000);
       s.deselectByValue("323");
	   Thread.sleep(1000);
       s.deselectByVisibleText("324");
       
       
       //s.deselectAll();//deselect all selected options at a time

	}

}
