package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeMyTrip {
	@FindBy(xpath="//span[@class='lbl_input latoBold  appendBottom5']")
	private WebElement from;
	public void from(String name)
	{
		from.sendKeys(name);
	}
	
	@FindBy(xpath="//p[contains(.,'Mumbai, India')]")
	private WebElement source;
	public void source(String name)
	{
		source.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@data-cy='toCity']")
	private WebElement to;
	public void to(String name)
	{
		to.sendKeys(name);
	}
	@FindBy(xpath="//p[contains(.,'Delhi, India')]")
	private WebElement destination;
	public void destination(String name)
	{
		destination.sendKeys(name);
	}
	
	@FindBy(xpath="	//a[contains(.,'Search')]")
	private WebElement search;
	public void search(String name)
	{
		search.sendKeys(name);
	}


	@FindBy(xpath="//span[@class='check']")
	private WebElement nonstop;
	public void nonstp()
	{
		nonstop.click();;
	}

	
	@FindBy(xpath="//div[@class=boldFont']")
	private WebElement timining;
	public void time()
	{
		timining.click();;
	}

	
	
	@FindBy(xpath="//span[@class='check']")
	private WebElement airline;
	public void airline()
	{
		airline.click();;
	}

	
	@FindBy(xpath="//span[text()='View Prices']")
	private WebElement lowprice;
	public void lp()
	{
		lowprice.click();;
	}

	
	@FindBy(xpath="//button[text()='Book Now']")
	private WebElement booknow;
	public void booknow()
	{
		booknow.click();
	}

	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;
	public void radio(String name)
	{
		radio.click();
	}


	
	@FindBy(xpath="//button[@id='review-continue']")
	private WebElement continuee;
	public void cont()
	{
		continuee.clear();;
	}

	

	@FindBy(xpath="//input[@placeholder='First & Middle Name']")
	private WebElement namee;
	public void name(String name)
	{
		namee.sendKeys(name);
	}

	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastname;
	public void surname(String name)
	{
		lastname.sendKeys(name);
	}

	@FindBy(xpath="//input[@placeholder='Mobile No']")
	private WebElement mob;
	public void mob(String name)
	{
		mob.sendKeys(name);
	}


	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement mail;
	public void mail(String name)
	{
		mail.sendKeys(name);
	}


	@FindBy(xpath="//button[text()='Continue']")
	private WebElement con;
	public void contin2(String name)
	{
		con.sendKeys(name);
	}


	@FindBy(xpath="//span[text()='MALE']")
	private WebElement gender;
	public void gender()
	{
		gender.click();;
	}


	
	@FindBy(xpath="//a[text()='CONFIRM']")
	private WebElement confirm;
	public void conf(String name)
	{
		confirm.click();;
	}


	//need to navigate back

	@FindBy(xpath="//span[text()='₹ 5,522']")
	private WebElement fareprize;

	
	public  String fareprize()
	{
		return fareprize.getText();
	}

	

	
}
