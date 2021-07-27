package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStone10 {
		
		@FindBy(xpath="//div[@class=\"lc-mmsuz6 e1dmt1bi0\"]")
		private WebElement chat;
		public void chatwith()
		{
			chat.click();
		}
		@FindBy(name="name")
		private WebElement namee;
        public void name(String name)
        {
        	namee.sendKeys(name);
        }
       public  BlueStone10(WebDriver driver)
       {
   		PageFactory.initElements(driver, this);

       }
       @FindBy(name="email")
		private WebElement email;
       public void email(String name)
       {
       	email.sendKeys(name);
       }
       @FindBy(xpath="//input[@class='lc-m2sc8j e1xplv9i0'])[3]")
		private WebElement phnno;
      public void phnno(String name)
      {
      	phnno.sendKeys(name);
      }
      @FindBy(xpath="//span[contains(.,'Start the chat')]")
		private WebElement start;
    public void start( )
    {
    	start.click();
    }
    @FindBy(xpath=" //div[@class='lc-1f7d9yq ex4ls1q0']/child::textarea")
	private WebElement message;
public void message(String name )
{
	message.sendKeys(name);
}
@FindBy(xpath="//div[@class=\\\"lc-1h0mrys eovu8nx0\\\"])[1]")
	private WebElement replaytext;
public String replay( )
{
	return replaytext.getText();
}


    


	}

