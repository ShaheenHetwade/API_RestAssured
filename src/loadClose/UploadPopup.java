package loadClose;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://smallpdf.com/jpg-to-pdf");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
			Thread.sleep(2000);
			Runtime r=Runtime.getRuntime();
			r.exec("‪E:\\pcam11.exe");
	}

}
