package Module2_Fireboult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBEmailPwdPage {

	@FindBy(xpath="//input[@id='CustomerEmail']") private WebElement Email;
	@FindBy(xpath="//input[@id='CustomerPassword']") private WebElement Password;
	@FindBy(xpath="//input[@value='Sign In']") private WebElement signin;
	
	public FBEmailPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void InpFBEmailPwdPageEmail(String mail) 
	{
		Email.sendKeys(mail);
	}
	
	public void InpFBEmailPwdPagePwd(String pwd) 
	{
		Password.sendKeys(pwd);
	}
	
	public void ClickFBEmailPwdPagesignin()
	{
		signin.click();
	}
	
	
}
