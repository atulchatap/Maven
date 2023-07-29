package Module2_Fireboult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSearchPage {

	@FindBy(xpath="//input[@type='search']") private WebElement searchbox;
	@FindBy(xpath="//a[@class='predictive__result']") private WebElement result;
	
	public FBSearchPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpFBMyprofilePageSearchbox(String Ult)
	{
		searchbox.sendKeys(Ult);
	}

	public void ClickFBMyprofilePageResult()
	{
		result.click();
		
	}
	
	
	
	
	
}
