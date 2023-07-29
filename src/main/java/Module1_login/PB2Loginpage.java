package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB2Loginpage {
	
	@FindBy(xpath="//a[text()='Sign in']") private WebElement signin;
	
	public PB2Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickPB2LoginpageSignin() 
	{
		signin.click();
	}
	
	
	

}
