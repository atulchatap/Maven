package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB2Pwdpage {

	@FindBy(xpath="//input[@name='password']") private WebElement Password;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement Login;

	public PB2Pwdpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpPB2PwdpagePassword(String Passwd) 
	{
		Password.sendKeys(Passwd);
	}
	
	public void ClickPB2PwdpageLogin() 
	{
		Login.click();
	}
	
}
