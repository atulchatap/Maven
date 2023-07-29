package Module2_Fireboult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBResultPage {
	
	@FindBy(xpath="//ul[@class='site-nav__dropdown text-left        ']") private WebElement more;
	@FindBy(xpath="(//div[@data-value='Gold SS'])[1]") private WebElement gold;
	@FindBy(xpath="//button[text()='Notify Me']") private WebElement notifyme;
	
	WebDriver driver1;
	
	public FBResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void OpenDDFBResultPageMore() 
	{
		Actions a1 = new Actions(driver1);
		a1.moveToElement(more).perform();
	}
	
	public void ClickFBResultPagegold() 
	{
		gold.click();
	}
	
	public void ClickFBResultPageNotify() 
	{
		notifyme.click();
	}

	
	
	
}
