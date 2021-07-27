package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStone {

	@FindBy(xpath="//input[@name='search_query']")
	private WebElement SearchBox;
	@FindBy(xpath="//img[@alt='The Felicita Top Open Ring']")
	private WebElement ring;
	@FindBy(xpath="//input[@id='buy-now']")
	private WebElement buynow;
	@FindBy(xpath="//div[@class='formErrorContent']")
	private WebElement errormsg;


	public BlueStone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendext(String text)
	{
		SearchBox.sendKeys(text,Keys.ENTER);
	}
	
	
	public void getring()
	{
		ring.click();;
	}
	public void buy()
	{
		buynow.click();;
	}
	
	public String geterr()
	{
		return errormsg.getText()	;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
