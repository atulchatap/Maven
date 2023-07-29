package LibraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver driver;
	public void Initializebrowser(String browsername) throws IOException 
	{
		if(browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
	//	else if(browsername.equals("firefox"))
	//	{
	//		driver = new FirefoxDriver();
	//	}
	
	driver.manage().window().maximize();
	driver.get(UtilityClass.GetPFdata("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
}
