package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB2MobNumpage {

	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement LoginWithPwd;

	public PB2MobNumpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpPB2MObNumPageMobNum(String Mnum)
	{
		MobNum.sendKeys(Mnum);
	}
	
	public void ClickPB2MObNumPageLoginWithPwd() 
	{
		LoginWithPwd.click();
	}
	
	
}
