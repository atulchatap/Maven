package Module1_login;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB2Profilepage {

	@FindBy(xpath="//input[@name='personName']") private WebElement Username;
	WebDriver driver1;
	
	public PB2Profilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void SwitchtoPB2ProfilepageChildWindow()
	{
		Set<String> allwind = driver1.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<String>(allwind);
		driver1.switchTo().window(a1.get(1));
	}
	
	public String GetPB2ProfilepageUsename()
	{
		String text = Username.getAttribute("value");
		return text;
	}
	
	
	
}
