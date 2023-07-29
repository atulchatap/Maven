package Module2_Fireboult;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Libreryfile_Fireboult.Baseclass_FB;

public class FBLoginPage {

	@FindBy(xpath="//a[@class='site-nav__link site-nav__link--icon medium-down--hide']") private WebElement Signup;
	
	public FBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickFBLoginPageLogin() throws IOException, InterruptedException 
	{
		Signup.click();
	}

	
	
	
	
}
