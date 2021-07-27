package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shaheen");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hetwade");
        driver.findElement(By.xpath(" //input[@name='reg_email__']")).sendKeys("shaheenhetwade@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("shaheenhetwade@gmail.com");
		driver.findElement(By.xpath(" //input[@name='reg_passwd__']")).sendKeys("shaheen");
		WebElement sex=driver.findElement(By.xpath("//input[@name='sex']"));
		sex.click();
		System.out.println(sex.isSelected());                                        //WebElement method=isSelected()
		System.out.println(sex.getTagName());                                        //WebElement method=getTagName()
		Point loc=sex.getLocation();
		System.out.println(loc);                                                     //WebElement method=getLocation()
	    System.out.println(loc.getX()+"  "+loc.getY());



		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		




}           }   