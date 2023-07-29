package Module2_Fireboult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBMyprofilePage {
	
	@FindBy(xpath="(//span[text()='Search'])[1]") private WebElement Searchbutton;
	
	public FBMyprofilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickFBMyprofilePageSearchbutton() 
	{
		Searchbutton.click();
	}
	
	
	
}
